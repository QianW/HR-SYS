package com.innovatis.action;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.innovatis.util.RandomNumber;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component("randomAction")
public class RandomAction extends ActionSupport {
	private ByteArrayInputStream inputStream;

    public String random() throws Exception {
        RandomNumber rd = RandomNumber.getInstance();
        this.setInputStream(rd.getImage());
        Map<String, Object> session=ActionContext.getContext().getSession();
        session.put("random", rd.getString());
        
        return SUCCESS;
    }

    public void setInputStream(ByteArrayInputStream inputStream) {
        this.inputStream = inputStream;
    }

    public ByteArrayInputStream getInputStream() {
        return inputStream;
    }
}
