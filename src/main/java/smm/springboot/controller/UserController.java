package smm.springboot.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smm.springboot.dto.UserDTO;
import smm.springboot.dto.request.SelectUserDTO;
import smm.springboot.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * 在定义一个Rest接口时，我们通常会使用GET，POST，PUT，DELETE几种方式来完成我们所需要进行CRUD的一些操作，
 * 我们在这里罗列和教大家在实际开发中的使用，一些基本概念我们就不再赘述，例如使用POST的优缺点，可使用参数的大小限制等地：

    GET：一般用于查询数据，不办函数据的更新以及插入操作。由于明文传输的关系，我们一般用来获取一些无关用户的信息。

    POST：一般用于数据的插入操作，也是使用最多的传输方式，但是在H5调用时会有跨域的问题，一般使用JSONP来解决。

    PUT：我们使用PUT方式来对数据进行更新操作。

    DELETE：用于数据删除，注意在数据库内是逻辑删除（改变数据状态，用户不再查询得到，但还保留在数据库内）还是物理删除（真删了）。

 */
@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping("/test")
     public String say(){
         return "springBoot:"+userService;
     }
	
	@RequestMapping("/findUser")
	public String find(@RequestBody SelectUserDTO userDTO){
     	log.info("find-----------start");
		UserDTO user =  userService.find(userDTO.getId());
		return JSON.toJSONString(user);
	}

	@RequestMapping("/findUser2")
	public String findRequst(HttpServletRequest userDTO){
		log.info("find-----------start");
		UserDTO user =  userService.find(2);
		return JSON.toJSONString(user);
	}
	@RequestMapping("/ajax")
	public String find1(){
		return "[''message':'123dfx']";
	}
}
