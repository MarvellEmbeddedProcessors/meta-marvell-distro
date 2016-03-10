FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://iptables.rules"

do_install_append_clearfog() {
    install -d ${D}${sysconfdir}/iptables
    install -m 0600 ${WORKDIR}/iptables.rules ${D}${sysconfdir}/iptables/iptables.rules
}
