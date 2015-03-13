# Image generation for Random Guy's Raspberry media server

inherit core-image

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES_append = "\
  ssh-server-openssh \
  splash \
  "

IMAGE_INSTALL_append = "\
  packagegroup-core-x11-base \
  mpd \
  minidlna \
  "
