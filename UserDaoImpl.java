package dao.impl;

import dao.UserDao;
import entity.User;

/**
 * �û�DAO�࣬ʵ��UserDao�ӿڣ�����User��ĳ־û�����
 */
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		// ���ﲢδʵ�����������ݿ��������Ϊ˵������
		System.out.println("�����û���Ϣ�����ݿ�");
	}
}