SUMMARY = "Strong open source chess engine"
DESCRIPTION = "Strong open source chess engine"
AUTHOR = "Marco Costalba"
HOMEPAGE = "https://stockfishchess.org/"
SECTION = "games"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://Copying.txt;md5=3c34afdc3adf82d2448f12715a255122"

SRC_URI = " \
  git://github.com/official-stockfish/Stockfish.git;protocol=https;tag=sf_${PV} \
"

PR = "r0"

S = "${WORKDIR}/git/"

STOCKFISH_TARGET_ARCH ?= "general-32"

do_compile() {
  cd src/ && oe_runmake stockfish ARCH=${STOCKFISH_TARGET_ARCH} COMPCXX="${CXX}" COMP=nodetect optimize=no
}

do_install() {
  install -D ${S}/src/stockfish ${D}/${bindir}/stockfish
}
