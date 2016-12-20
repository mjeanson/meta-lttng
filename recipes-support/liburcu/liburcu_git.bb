SUMMARY = "Userspace RCU (read-copy-update) library"
HOMEPAGE = "http://lttng.org/urcu"
BUGTRACKER = "http://lttng.org/project/issues"

LICENSE = "LGPLv2.1+ & MIT-style"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f060c30a27922ce9c0d557a639b4fa3 \
                    file://urcu.h;beginline=4;endline=32;md5=4de0d68d3a997643715036d2209ae1d9 \
                    file://urcu/uatomic/x86.h;beginline=4;endline=21;md5=58e50bbd8a2f073bb5500e6554af0d0b"

SRC_URI = "git://git.liburcu.org/userspace-rcu.git;branch=stable-0.9 \
           file://Revert-Blacklist-ARM-gcc-4.8.0-4.8.1-4.8.2.patch \
          "

SRCREV = "${AUTOREV}"
PV = "0.9+git${SRCPV}"

S = "${WORKDIR}/git"

CFLAGS_append_libc-uclibc = " -D_GNU_SOURCE"
inherit autotools
