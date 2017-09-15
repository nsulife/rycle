package kr.spring.tiles.member.service;

import java.util.List;



import kr.spring.tiles.member.model.dto.MemberVO;

public interface MemberService {
	// ȸ�� ��� 
	public List<MemberVO> memberList();
	// ȸ�� �Է�
	public void insertMember(MemberVO vo);
	// ȸ�� ���� �󼼺���
	public MemberVO viewMember(String userId);
	// ȸ������
	public void deleteMember(String userId);
	// ȸ������ ����
	public void updateMember(MemberVO vo);
	// ��й�ȣ üũ
	public boolean checkPw(String userId, String userPw);
}