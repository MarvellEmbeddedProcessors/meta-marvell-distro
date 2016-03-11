DESCRIPTION = "Marvell router demo image"
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-openssh"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "\
    dnsmasq \
    ipsec-tools \
    iptables \
    openssl \
    procps \
    strongswan \
    udev-extraconf \
"
