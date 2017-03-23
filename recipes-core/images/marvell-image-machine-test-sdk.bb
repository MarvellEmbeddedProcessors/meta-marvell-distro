DESCRIPTION = "A console-only image for test and development purpose"
LICENSE = "MIT"

include marvell-image-machine-test.bb

IMAGE_FEATURES += " \
    tools-sdk \
"
