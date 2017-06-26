FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_marvell = " \
    file://fix-gic-set-vm-gic-version-as-host.patch \
"
