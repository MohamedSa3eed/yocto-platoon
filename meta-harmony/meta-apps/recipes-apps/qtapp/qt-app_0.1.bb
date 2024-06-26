SUMMARY = "QT Platoon infotainment Application Recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/HaiidyHossam/QT-Modules_Test;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

DEPENDS += " qtbase qtmultimedia qtconnectivity qtquickcontrols2 cinematicexperience qtdeclarative qtmqtt qtgraphicaleffects qtquick3d qtquickcontrols"
RDEPENDS_${PN} += "qtmultimedia-qmlplugins qtmultimedia-plugins qtconnectivity-qmlplugins qtquickcontrols2-plugins \
         qtquickcontrols2-qmlplugins cinematicexperience-plugins cinematicexperience-qmlplugins qtimageformats-plugins qtdeclarative-plugins qtdeclarative-qmlplugins qtbase-plugins \
         qtgraphicaleffects-plugins qtgraphicaleffects-qmlplugins qtmqtt-plugins qtmqtt-qmlplugins qtquickcontrols-plugins qtquickcontrols-qmlplugins qtquick3d-plugins \ 
         qtquick3d-qmlplugins qtquickcontrols qtquickcontrols2 qtgraphicaleffects"


S = "${WORKDIR}/git"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/Infotainment_Platoon ${D}${bindir}
}

inherit qmake5
