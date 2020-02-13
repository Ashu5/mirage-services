package mirageservices.mirageservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import mirageservices.mirageservices.model.UserInfo;

@RestController
@RequestMapping("/mirage-services")
public class MirageController {

	/*
	 * @GetMapping("/hello") public String sayHello() { return "Hello Ashutosh"; }
	 */

	@GetMapping("/getUsers")
	public List<UserInfo> getUsers() {
		Gson json= new Gson();
		List<UserInfo> list = new ArrayList<>();
		for(int i=0;i<3;i++) {
		list.add(new UserInfo("Portashu5", "password", "Ashutosh", "www.ashu5@gmail.com", 24, "male"));
		}
		json.toJson(list);
		System.out.println("List Contents:" + list);
		return list;
	}

}
