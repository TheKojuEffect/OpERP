package devopsdistilled.operp.server.context.employee;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import devopsdistilled.operp.server.data.service.employee.EmployeeService;

@Configuration
public class EmployeeRmiContext {

	@Inject
	private EmployeeService employeeService;

	@Bean
	public RmiServiceExporter rmiEmployeeServiceExporter() {
		RmiServiceExporter rmiServiceExportor = new RmiServiceExporter();
		rmiServiceExportor.setServiceInterface(EmployeeService.class);
		String serviceName = rmiServiceExportor.getServiceInterface()
				.getCanonicalName();
		rmiServiceExportor.setServiceName(serviceName);
		rmiServiceExportor.setService(employeeService);
		rmiServiceExportor.setRegistryPort(1099);
		return rmiServiceExportor;
	}

}
