//package com.section1.firstSpringproject;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//public class welcomecontrolaer {
//
//	@RequestMapping("")
//	public String welcome() {
//		return "<h1> Hello client !How are you doing</h1>";
//	}
//	@RequestMapping("random")
//	public String welcome2() {
//		return "<h1> spring boot is great ! so easy to just respond with string </h1>";
//	}
//	@RequestMapping(value="folan",method=RequestMethod.GET)
//	public String welcomeGet(@RequestParam(value="wadee")String name) {
//		return "<h1> welcome to our web</h1>";
//	}
//	 @RequestMapping("/greeting")
//	    public String index(){
//	      return "Hello user!";
//	    }
//	    // you can be explicit about the request as well
//	    @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
//	    public String hello(){
//	      return "Hello world! What route did you use to access me?";
//	    }
//	    @RequestMapping("/greeting/goodbye")
//	    public String world(){
//	      return "Goodbye world!";
//	    }
//}
