package com.lizp.springmvc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizp.springmvc.domain.TxChannel;
import com.lizp.springmvc.persist.TxChannelDao;
import com.lizp.springmvc.service.ITxChannelService;

@Service("txChannelService")
public class TxChannelServiceImpl implements ITxChannelService {
	private static Logger logger = LoggerFactory.getLogger(TxChannelServiceImpl.class);
	@Autowired
	private TxChannelDao txChannelDao;

	@Override
	public TxChannel selectById(String channelSerialNo, String custId) {
		return txChannelDao.selectByPrimaryKey(channelSerialNo, custId);
	}

	@Override
	public TxChannel selectByPaySerialNo(String paySerialNo, String custId) {
		try {
			return txChannelDao.selectByPaySerialNo(paySerialNo, custId);
		} catch (Exception e) {
			// 防止系统异常，导致支付流水和渠道流水不是一一对应的关系
			logger.error("根据支付流水号{}查询渠道流水异常", paySerialNo, e);
			return null;
		}
	}

	@Override
	public int insertSelective(TxChannel txChannel) {
		if (txChannel == null) {
			return 0;
		}
		return txChannelDao.insertSelective(txChannel);
	}

	@Override
	public int updateById(TxChannel txChannel) {
		if (txChannel == null) {
			return 0;
		}
		return txChannelDao.updateByPrimaryKeySelective(txChannel);
	}

}
