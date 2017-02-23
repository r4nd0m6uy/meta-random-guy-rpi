# Image generation for Random Guy's Raspberry media server

inherit core-image extrausers

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES_append = "\
  ssh-server-openssh \
  splash \
  package-management \
  "

IMAGE_INSTALL_append = " \
	charguychess \
	"

# Root password
EXTRA_USERS_PARAMS = "usermod -P piepie root;"
