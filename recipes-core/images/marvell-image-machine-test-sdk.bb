DESCRIPTION = "A console-only image for test and development purpose"
LICENSE = "MIT"

include marvell-image-machine-test.bb

IMAGE_FEATURES += " \
    dev-pkgs \
    tools-sdk \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    bison \
    cmake \
    git \
    i2c-tools \
    lzo \
    lzop \
    mtd-utils \
    mtd-utils-ubifs \
    ncurses \
    nfs-utils \
    unfs3 \
    vim \
    zlib \
    samba \
    inetutils \
    iperf3 \
    ethtool \
    arptables \
    tcpdump \
    alsa-utils \
    mdadm \
    sysstat \
    lmbench \
    memtester \
    procps \
    acpitool \
    hexedit \
    ifenslave \
    xfsprogs \
"
