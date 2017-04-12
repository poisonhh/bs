package bs;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.qczl.model.Admin;
import com.qczl.service.IAdminService;

public class TestMybatis {
	
	@Resource
	private IAdminService admindao;
	@Test
	public void test() {
		List<Admin> adminList = admindao.queryAll();
		System.out.println("===================");
		for (Admin admin : adminList) {
			System.out.println(admin);
		}
	}

}
