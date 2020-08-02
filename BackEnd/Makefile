booking_api_port = 8080
local_running_port = 8080

build:
	./gradlew clean build

generate_contract:
	cd ./swagger && ./gen_contract.sh

docker_build:
	make build
	docker build -t bapi_test -f docker/Dockerfile .

docker_run:
	make docker_build
	docker run -p $(local_running_port):$(booking_api_port) bapi_test:latest
