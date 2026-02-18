package com.anime.game.service;

import com.anime.game.model.AnimeCharacter;
import com.anime.game.repository.AnimeCharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final AnimeCharacterRepository characterRepository;
    
    public DataLoader(AnimeCharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        if (characterRepository.count() == 0) {
            loadCharacters();
        }
    }
    
    private void loadCharacters() {
        characterRepository.save(new AnimeCharacter(
            "亚丝娜", "アスナ", "刀剑神域", "ソードアート・オンライン",
            "女", "棕色", "棕色", "长发", "17", "主角", "温柔", "剑技高超", "细剑", "玩家", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "桐人", "キリト", "刀剑神域", "ソードアート・オンライン",
            "男", "黑色", "黑色", "短发", "17", "主角", "冷静", "双刀流", "双剑", "玩家", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "御坂美琴", "御坂美琴", "魔法禁书目录", "とある科学の超電磁砲",
            "女", "茶色", "茶色", "短发", "14", "主角", "傲娇", "超电磁炮", "硬币", "学生", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "樱岛麻衣", "桜島麻衣", "青春猪头少年不会梦到兔女郎学姐", "青春ブタ野郎はバニーガール先輩の夢を見ない",
            "女", "黑色", "紫色", "长发", "17", "主角", "成熟", "青春期综合征", "无", "演员", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "远坂凛", "遠坂凛", "Fate/stay night", "Fate/stay night",
            "女", "黑色", "蓝色", "长发", "18", "主角", "傲娇", "宝石魔术", "宝石", "魔术师", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "Saber", "セイバー", "Fate/stay night", "Fate/stay night",
            "女", "金色", "绿色", "长发", "15", "主角", "认真", "骑士王", "誓约胜利之剑", "英灵", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "初音未来", "初音ミク", "VOCALOID", "VOCALOID",
            "女", "蓝绿色", "蓝绿色", "长发", "16", "主角", "可爱", "歌姬", "葱", "虚拟歌手", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "三笠", "ミカサ", "进击的巨人", "進撃の巨人",
            "女", "黑色", "黑色", "短发", "15", "主角", "冷静", "阿克曼血统", "双刀", "士兵", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "艾伦", "エレン", "进击的巨人", "進撃の巨人",
            "男", "棕色", "绿色", "短发", "15", "主角", "冲动", "巨人化能力", "双刀", "士兵", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "利威尔", "リヴァイ", "进击的巨人", "進撃の巨人",
            "男", "黑色", "灰色", "短发", "30+", "配角", "洁癖", "阿克曼血统", "双刀", "士兵", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "雷姆", "レム", "Re:从零开始的异世界生活", "Re:ゼロから始める異世界生活",
            "女", "蓝色", "蓝色", "短发", "17", "配角", "温柔", "鬼族", "流星锤", "女仆", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "拉姆", "ラム", "Re:从零开始的异世界生活", "Re:ゼロから始める異世界生活",
            "女", "粉色", "红色", "短发", "17", "配角", "毒舌", "鬼族", "风魔法", "女仆", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "爱蜜莉雅", "エミリア", "Re:从零开始的异世界生活", "Re:ゼロから始める異世界生活",
            "女", "银色", "紫色", "长发", "18", "主角", "善良", "半精灵", "冰魔法", "王选候补", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "炭治郎", "炭治郎", "鬼灭之刃", "鬼滅の刃",
            "男", "黑红色", "深红色", "短发", "15", "主角", "善良", "日之呼吸", "日轮刀", "鬼杀队", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "祢豆子", "禰豆子", "鬼灭之刃", "鬼滅の刃",
            "女", "黑色", "粉色", "长发", "14", "配角", "温柔", "鬼化", "无", "鬼", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "千早爱音", "千早愛音", "BanG Dream! It's MyGO!!!!!", "BanG Dream! It's MyGO!!!!!",
            "女", "粉色", "蓝色", "长发", "16", "主角", "开朗", "吉他手", "吉他", "学生", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "丰川祥子", "豊川祥子", "BanG Dream! It's MyGO!!!!!", "BanG Dream! It's MyGO!!!!!",
            "女", "黑色", "红色", "长发", "16", "主角", "高冷", "键盘手", "键盘", "学生", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "高松灯", "高松燈", "BanG Dream! It's MyGO!!!!!", "BanG Dream! It's MyGO!!!!!",
            "女", "灰色", "金色", "短发", "16", "主角", "内向", "主唱", "无", "学生", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "椎名立希", "椎名立希", "BanG Dream! It's MyGO!!!!!", "BanG Dream! It's MyGO!!!!!",
            "女", "紫色", "金色", "短发", "16", "主角", "认真", "鼓手", "鼓", "学生", ""
        ));
        
        characterRepository.save(new AnimeCharacter(
            "长崎素世", "長崎そよ", "BanG Dream! It's MyGO!!!!!", "BanG Dream! It's MyGO!!!!!",
            "女", "金色", "绿色", "长发", "16", "主角", "温柔", "贝斯手", "贝斯", "学生", ""
        ));
    }
}