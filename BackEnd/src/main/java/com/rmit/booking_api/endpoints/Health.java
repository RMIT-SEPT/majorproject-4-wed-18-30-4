package com.rmit.booking_api.endpoints;

import com.rmit.booking_api.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Hello world endpoint")
public class Health {

    @RequestMapping(
            value = "/halo",
            method = RequestMethod.GET
    )
    @ResponseBody
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Success",
                    response = Person.class
            )
    })
    @ApiOperation(value = "A hello world endpoint", response = Person.class)
    public Person hello_world() {
        return new Person();
    }
}
