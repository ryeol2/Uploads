package spring.project.community.service;

import spring.project.community.join.dto.JoinDto;

public interface JoinMember {
	public void join(JoinDto joinDto);
	public JoinDto overLapid(String cId);
	public boolean overLapNick(JoinDto joinDto);

}
