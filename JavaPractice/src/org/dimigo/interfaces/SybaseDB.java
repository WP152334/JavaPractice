package org.dimigo.interfaces;

public class SybaseDB implements IDBManager {

	@Override
	public void insert() {
		System.out.println(SYBASE_DATABASE + " DB 저장");
	}

	@Override
	public void search() {
		System.out.println(SYBASE_DATABASE + " DB 조회");
	}

	@Override
	public void update() {
		System.out.println(SYBASE_DATABASE + " DB 변경");
	}

	@Override
	public void delete() {
		System.out.println(SYBASE_DATABASE + " DB 삭제");
	}

}
