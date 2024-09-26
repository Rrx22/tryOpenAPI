package org.openapitools.api;

import org.openapitools.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-26T21:22:47.044855600+02:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.sample.base-path:/api}")
public class UsersApiController implements UsersApi {

    private final NativeWebRequest request;

    @Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = List.of(
          new User().id(1).name("Alice Bobson").email("alice.bobson@something.com"),
          new User().id(2).name("Bob Bunny").email("bob.b@something.com"),
          new User().id(3).name("Chris Crusty").email("c.c@something.com")
        );
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
