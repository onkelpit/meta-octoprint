SUMMARY = "A wrapper for subprocess which provides command pipeline functionality."
SECTION = "devel/python"
HOMEPAGE = "https://pypi.python.org/pypi/sarge"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5924d2983f7af7369130f6fe5dd597b7"

SRC_URI = "https://pypi.python.org/packages/source/s/sarge/sarge-0.1.7.post1.tar.gz"
SRC_URI[md5sum] = "3e71764b078181277140d1bc3d08439f"
SRC_URI[sha256sum] = "64ff42ae6ef90acbded6318ed440ed63b31a669302fb60cf41265debea282a3d"

S = "${WORKDIR}/sarge-0.1.7.post1"

inherit setuptools3 python_pep517

BBCLASSEXTEND = "native"

DEPENDS += " python3-wheel-native"
