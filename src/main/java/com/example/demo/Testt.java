package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.FileInputStream;
@RestController
@RequestMapping("/framework")
@Tag(name = "user", description = "the user API")
public class Testt {
    /**
     * http://localhost:8080/swagger-ui/index.html
     * @param path
     * @return
     * @throws Exception
     */
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Bad request")
    })
    @Operation(summary = "Get a greeting message")
    @GetMapping(path = "/getFile")
    public String getFile(@RequestParam("path") String path) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "NOT IMPLEMENTED ");
        //return "{\"Hello\":\"world\"}";

    }
}
