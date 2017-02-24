SUMMARY = "CppUTest is a C/C++ based unit xUnit test framework for unit testing."
HOMEPAGE = "http://cpputest.github.io/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=ce5d5f1fe02bcd1343ced64a06fd4177"

SRC_URI = "git://github.com/cpputest/cpputest.git;tag=v${PV}"

BBCLASSEXTEND = "native"

inherit cmake

EXTRA_OECMAKE = "-DTESTS=OFF"

FILES_${PN}-dev += " \
  /usr/lib/CppUTest \
  /usr/lib/CppUTest/cmake \
  /usr/lib/CppUTest/cmake/CppUTestConfigVersion.cmake \
  /usr/lib/CppUTest/cmake/CppUTestTargets.cmake \
  /usr/lib/CppUTest/cmake/CppUTestTargets-relwithdebinfo.cmake \
  /usr/lib/CppUTest/cmake/CppUTestConfig.cmake \
  "

# cpputest doesn't provide runtime files but only headers and static
# libraries for development
ALLOW_EMPTY_${PN} = "1"

S = "${WORKDIR}/git"
