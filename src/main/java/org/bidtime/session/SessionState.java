package org.bidtime.session;

import org.bidtime.session.bean.SessionUserBase;

public class SessionState {
	
	SessionUserBase sessionUser;
	
	public SessionUserBase getSessionUser() {
		return sessionUser;
	}

	public void setSessionUser(SessionUserBase sessionUser) {
		this.sessionUser = sessionUser;
	}

	private int loginState;

	public int getLoginState() {
		return loginState;
	}

	public void setLoginState(int loginState) {
		this.loginState = loginState;
	}
	
	public SessionState(SessionUserBase sessionUser, int state) {
		this.sessionUser = sessionUser;
		this.loginState = state;
	}
	
}
