package com.kunintns.kafka_web_message.Vo;

// JSON 데이터를 보낼 VO
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageVO {

   public String id;          // 아이디

   public String position;

   public String lng;   // 위도

   public String lat;    // 경도

   public String time;

}