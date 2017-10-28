package cn.edu.bupt.yaoxintong.service;

import cn.edu.bupt.yaoxintong.util.ReturnModel;

public interface HotWordSevice {

	ReturnModel  getAllHotWord();

	ReturnModel getHotWord(String id);

	ReturnModel modifyHotWord(String id, String words);

	ReturnModel increaseHotWord(String words);

	ReturnModel deleteHotWord(String id);

}
