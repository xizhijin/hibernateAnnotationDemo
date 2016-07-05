package com.po.inheritance.unionsubclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		// ����һ����ͨԱ��
		Employee zhu = new Employee();
		// ����Ա���Ļ�������
		zhu.setName("����");
		zhu.setTitle("��Ŀ�鳤");
		zhu.setGender('��');
		zhu.setSalary(4500);
		// ����Ա�����������
		zhu.setAddress(new Address("����", "523034", "�й�"));
		
		// �����ڶ���Ա��
		Employee zhang = new Employee();
		// ���ø�Ա���Ļ�������
		zhang.setName("������");
		zhang.setTitle("��Ŀ����");
		zhang.setGender('Ů');
		zhang.setSalary(5500);
		// ���ø�Ա�����������
		zhang.setAddress(new Address("����", "523034", "�й�"));
		
		// ����һ����������
		Manager grace = new Manager();
		// ���þ�������Ļ�������
		grace.setName("Grace");
		grace.setTitle("��Ŀ����");
		grace.setGender('Ů');
		grace.setSalary(12000);
		// ���þ������������
		grace.setAddress(new Address("����", "523034", "����"));
		// ���þ����Ĺ�Ͻ��������
		grace.setDepartment("�з���");
		// ���õڶ���Ա����grace֮��Ĺ�����ϵ
		zhang.setManager(grace);
		// ����һ��Customer����
		
		Customer he = new Customer();
		// ����Customer����Ļ�������
		he.setName("С��");
		he.setGender('��');
		// ����Customer������������
		he.setAddress(new Address("����", "233034", "�й�"));
		he.setComments("ϲ������");
		// ����Customer�����grace����Ĺ�����ϵ
		he.setEmployee(grace);
		// ����һ����ͨPerson����
		
		Person lee = new Person();
		// ����Person����Ļ�������
		lee.setName("Yeeku");
		lee.setGender('��');
		// ����Person������������
		lee.setAddress(new Address("���", "434333", "�й�"));
		// �־û�����ʵ�塣
		session.save(lee);
		session.save(grace);
		session.persist(zhu);
		session.persist(zhang);
		session.save(he);

		tx.commit();
		HibernateUtil.closeSession();
	}

}