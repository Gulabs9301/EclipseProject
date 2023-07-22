package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class Task {
	@GetMapping(value = "/oddOrEven/{a}")
	public String getNumber(@PathVariable int a) {
		if (a % 2 == 0) {
			return "EVEN";
		} else {
			return "ODD";
		}
	}

	@GetMapping(value = "/square/{a}")
	public int getSquare(@PathVariable int a) {
		return a * a;
	}

	@GetMapping(value = "/palindrome/{a}")
	public String getString(@PathVariable String a) {
		char[] b = a.toCharArray();
		String c = "";
		for (int i = b.length - 1; i >= 0; i--) {
			c = c + b[i];
		}
		if (a.equals(c)) {
			return "PALINDROME";
		} else {
			return "NOT PALINDROME";
		}
	}

	@GetMapping(value = "/prime/{a}")
	public String getStr(@PathVariable int a) {
		boolean temp = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				temp = false;
			} else {
				continue;
			}
		}
		if (temp) {
			return "Prime";
		} else {
			return "Not prime";
		}
	}

	@GetMapping(value = "/squareroot/{a}")
	public String getStr1(@PathVariable int a) {
//		int temp = 0;
//		for (int i = 1; i < a; i++) {
//
//			if (i * i == a) {
//				temp = 0;
//			} 
//		}
//		if (temp == 0) {
//			return "Square";
//		} else {
//			return "Not Square";
//		}
		boolean temp = true;
		for (int i = 1; i < a; i++) {
			if (i * i == a) {
				temp = false;
			} else {
				continue;
			}
		}
		if (temp) {
			return "Not Square";
		} else {
			return "Square";
		}
	}

	@RequestMapping(value = "/evenseq/{a}")
	public List<Integer> getEven(@PathVariable int a) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 1; i < a; i++) {
			if (i % 2 == 0) {
				nums.add(i);
			}
		}
		return nums;
	}

	@GetMapping(value = "/acessCheck")
	public String getAccess(@RequestParam String username, @RequestParam String password) {
		if (username.equals("Naveen") && password.equals("guru")) {
			return "Acess granted";
		} else {
			return "Access Denied";
		}
	}

	@GetMapping(value = "/getCar")
	public Car getCars(@RequestBody Car c) {
		return c;
	}

	@GetMapping(value = "/getcar")
	public List<Car> getCars(@RequestBody List<Car> cars) {
		return cars.stream().filter(x -> x.getColor().equals("Black")).collect(Collectors.toList());
	}

	@GetMapping(value = "/getcarcount")
	public List<Car> getCars1(@RequestBody List<Car> cars) {
		List<Car> c = cars.stream().filter(x -> x.getCc() > 200).collect(Collectors.toList());
		c.forEach(x -> {

			int a = x.getPrice() + (x.getPrice() * 5) / 100;
			x.setPrice(a);
		});
		return c;

	}

}
