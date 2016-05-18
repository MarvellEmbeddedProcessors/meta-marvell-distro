DESCRIPTION = "A console-only image with applications for test"
LICENSE = "MIT"

IMAGE_FEATURES += "\
    ssh-server-openssh \
    tools-profile \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "\
    python \
    iperf \
    file \
    docker \
    lxc \
    libvirt \
    qemu \
    strongswan \
    iptables \
    netmap-marvell-prv \
"
