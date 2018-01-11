FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_marvell = " \
    file://splice-support.patch \
"

do_install_append() {
    sed -e 's,/usr/bin,${base_bindir},g' -i ${D}${sysconfdir}/init.d/samba.sh
}
