FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_marvell = " \
    file://splice-support.patch \
"
