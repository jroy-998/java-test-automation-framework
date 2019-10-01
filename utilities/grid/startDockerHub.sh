#stop and remove all existing containers
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)

#start the hub
docker run -d -p 4444:4444 --name selenium-hub selenium/hub

#start the nodes
docker run -d --link selenium-hub:hub selenium/node-chrome
docker run -d --link selenium-hub:hub selenium/node-firefox

#start the debuggers
docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug
docker run -d -P --link selenium-hub:hub selenium/node-firefox-debug

#display ports used for vnc purposes
docker ps -a | grep node-chrome-debug
docker ps -a | grep node-firefox-debug
