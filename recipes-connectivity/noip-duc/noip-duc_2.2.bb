SUMMARY = "A dynamic DNS client for no-ip.com"
DESCRIPTION = "A dynamic client to update your public IP address at no-ip.com"
AUTHOR = "johna <johna@onevista.com>"
HOMEPAGE = "http://www.noip.com/"
SECTION = "networking"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=7975d4f2e1ca1e9df4dcfd94c6e1ae48"

S = "${WORKDIR}/noip-2.0"

PR = "r0"

SRC_URI[md5sum] = "86f164e2ec0692b4901f2a57135a327c"
SRC_URI[sha256sum] = "208dbc1abb245981ac72dfc0adc8725f9143b4f11f72c2e17dce24278723ab61"

SRC_URI = " \
  http://onevista.com/noip-${PV}.tgz \
  file://0001-noip2.c-Remove-prefix-for-configuration-files.patch \
"

do_compile () {
  # There's already a binary compiled for x86_64, run make clean to remove it 
  # and force recompiling for the target architecture
  oe_runmake clean
  oe_runmake
}

do_install () {
  install -d -m 0777 ${D}/${bindir}/
  install -m 0755 ${S}/noip2 ${D}/${bindir}/
}
