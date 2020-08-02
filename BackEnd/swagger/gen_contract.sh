#!/usr/bin/env bash

args="localhost:8080/v3/api-docs/"
if curl --fail "$args" > /dev/null 2>&1; then
  curl "$args" | jq > booking_api.json
else
  echo "Booking API not running at localhost:8080" >2
fi

