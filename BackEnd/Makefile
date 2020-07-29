build:
	./gradlew clean build

docker_build:
	make build
	docker build -t bapi_test -f docker/Dockerfile .

docker_run:
	make docker_build
	docker run -p 8080:8080 bapi_test:latest
