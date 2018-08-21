package Funding.Mapper;

import java.util.List;

import Funding.Bean.Contents;

public interface ContentsMapper {
	
Contents DetailContents(int c_num);

List<Funding.Bean.Contents> AllListContents();

}
//contents Mapper
