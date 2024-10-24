SUMMARY = "A generator framework based on a common modern IDL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eee61e10a40b0e3045ee5965bcd9a8b5"

SRC_URI[sha256sum] = "b55c239f3ae7e23c5c8434f38901c5bcacb6afd17e88e37934b46e44558df295"

inherit pypi setuptools3

# Colorama is optional dependency from coloredlogs, but
# it seems to be required in general, at least on windows
DEPS = "\
    python3-antlr4-runtime \
    python3-argh \
    python3-click \
    python3-coloredlogs \
    python3-jinja2 \
    python3-markupsafe \
    python3-pyyaml \
    python3-six \
    python3-watchdog \
    python3-pytest \
    python3-colorama \
"
DEPENDS += "${DEPS}"
RDEPENDS:${PN} += "${DEPS}"

BBCLASSEXTEND = "nativesdk native"
