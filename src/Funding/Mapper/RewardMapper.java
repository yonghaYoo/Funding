package Funding.Mapper;

import java.util.List;

import Funding.Bean.Reward;
public interface RewardMapper {

	List<Reward> DetailRewardList (int c_num);
	int InsertReward(Reward reward);
}
