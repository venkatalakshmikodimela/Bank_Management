package com.bank.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BankFrentEndController extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

		@Override
		protected Class<?>[] getServletConfigClasses()
		{
			Class [] springConfigurationclass= {UserConfig.class};
			return springConfigurationclass;
		}
		
		
			@Override
			protected String[] getServletMappings() 
			{
				String [] mappings = {"/bank/*"};
				return mappings;
			}
			
}
