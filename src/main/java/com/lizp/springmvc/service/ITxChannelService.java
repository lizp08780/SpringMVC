package com.lizp.springmvc.service;

import com.lizp.springmvc.domain.TxChannel;

public interface ITxChannelService {
	TxChannel selectById(String channelSerialNo, String custId);

	TxChannel selectByPaySerialNo(String paySerialNo, String custId);

	int insertSelective(TxChannel txChannel);

	int updateById(TxChannel txChannel);

}
