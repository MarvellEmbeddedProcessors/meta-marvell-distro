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
    lxc \
    libvirt \
    qemu \
    strongswan \
    ${@bb.utils.contains("MACHINE_ENDIANNESS", "le", "docker", "", d)} \
    cryptsetup \
"
