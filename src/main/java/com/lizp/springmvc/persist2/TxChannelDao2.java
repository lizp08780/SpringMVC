package com.lizp.springmvc.persist2;

import org.apache.ibatis.annotations.Param;

import com.lizp.springmvc.domain.TxChannel;

public interface TxChannelDao2 {
	int insertSelective(TxChannel txChannel);

	TxChannel selectByPrimaryKey(@Param("channelSerialNo") String channelSerialNo, @Param("custId") String custId);

	int updateByPrimaryKeySelective(TxChannel txChannel);

	TxChannel selectByPaySerialNo(@Param("paySerialNo") String paySerialNo, @Param("custId") String custId);

}