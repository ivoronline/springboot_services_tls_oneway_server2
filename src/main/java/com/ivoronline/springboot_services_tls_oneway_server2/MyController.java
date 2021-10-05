package com.ivoronline.springboot_services_tls_oneway_server2;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==================================================================
  // SOAP
  //==================================================================
  @RequestMapping("/Hello")
  public String soap(@RequestBody String requestSOAP) {
    return requestSOAP;
  }

}
