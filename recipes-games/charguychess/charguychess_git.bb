SUMMARY = "Chess DIY hardware"
DESCRIPTION = "Application to run with the charguy chess hardware"
AUTHOR = "R4nd0m6uy <r4nd0m6uy@r4nd0m6uy.ch>"
HOMEPAGE = "http://r4nd0m6uy.ch/"
SECTION = "games"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libevent"

inherit cmake

SRC_URI = " \
  git://github.com/r4nd0m6uy/charguychess.git;protocol=https;branch=master \
"
SRCREV = "${AUTOREV}"
PV = "git-${SRCPV}"
PR = "r0"
S = "${WORKDIR}/git"
