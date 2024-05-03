package com.pocket.chikorita.common;

import com.alibaba.fastjson2.JSONArray;

public class MockUtil {
    public static JSONArray getPokemonMock(){
        String str = """
                [
                        {
                            "zukan_id": "0001",
                            "zukan_sub_id": 0,
                            "pokemon_name": "妙蛙种子",
                            "pokemon_sub_name": "",
                            "weight": 6.9,
                            "height": 0.7,
                            "file_name": "/img/pm/cf47f9fac4ed3037ff2a8ea83204e32aff8fb5f3.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0002",
                            "zukan_sub_id": 0,
                            "pokemon_name": "妙蛙草",
                            "pokemon_sub_name": "",
                            "weight": 13,
                            "height": 1,
                            "file_name": "/img/pm/3245e4f8c04aa0619cb31884dbf123c6918b3700.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0003",
                            "zukan_sub_id": 0,
                            "pokemon_name": "妙蛙花",
                            "pokemon_sub_name": "",
                            "weight": 100,
                            "height": 2,
                            "file_name": "/img/pm/0186d64c5773c8d3d03cd05dc79574b2d2798d4f.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0003",
                            "zukan_sub_id": 1,
                            "pokemon_name": "超级妙蛙花",
                            "pokemon_sub_name": "",
                            "weight": 155.5,
                            "height": 2.4,
                            "file_name": "/img/pm/3bfcc4360c44f37815dc1e59f75818935cbfc41b.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0003",
                            "zukan_sub_id": 2,
                            "pokemon_name": "妙蛙花",
                            "pokemon_sub_name": "超极巨化",
                            "weight": 999.99,
                            "height": 24,
                            "file_name": "/img/pm/6b55babb3825ef9fa9e5d9ff44a14bdb8406ce97.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0004",
                            "zukan_sub_id": 0,
                            "pokemon_name": "小火龙",
                            "pokemon_sub_name": "",
                            "weight": 8.5,
                            "height": 0.6,
                            "file_name": "/img/pm/d0ee81f16175c97770192fb691fdda8da1f4f349.png",
                            "pokemon_type_id": "fire",
                            "pokemon_type_name": "火"
                        },
                        {
                            "zukan_id": "0005",
                            "zukan_sub_id": 0,
                            "pokemon_name": "火恐龙",
                            "pokemon_sub_name": "",
                            "weight": 19,
                            "height": 1.1,
                            "file_name": "/img/pm/285395ca77d82861fd30cea64567021a50c1169c.png",
                            "pokemon_type_id": "fire",
                            "pokemon_type_name": "火"
                        },
                        {
                            "zukan_id": "0006",
                            "zukan_sub_id": 0,
                            "pokemon_name": "喷火龙",
                            "pokemon_sub_name": "",
                            "weight": 90.5,
                            "height": 1.7,
                            "file_name": "/img/pm/2050f1fd1283f473d7d048f8631712e7e003f802.png",
                            "pokemon_type_id": "fire,flying",
                            "pokemon_type_name": "火,飞行"
                        },
                        {
                            "zukan_id": "0006",
                            "zukan_sub_id": 1,
                            "pokemon_name": "超级喷火龙Ｘ",
                            "pokemon_sub_name": "",
                            "weight": 110.5,
                            "height": 1.7,
                            "file_name": "/img/pm/ca3db4aad5c85a525d9be86852b26db1db7a22c0.png",
                            "pokemon_type_id": "fire,dragon",
                            "pokemon_type_name": "火,龙"
                        },
                        {
                            "zukan_id": "0006",
                            "zukan_sub_id": 2,
                            "pokemon_name": "超级喷火龙Ｙ",
                            "pokemon_sub_name": "",
                            "weight": 100.5,
                            "height": 1.7,
                            "file_name": "/img/pm/0aa78a0061bda9d88cbb0bbf739cd9cc56522fe9.png",
                            "pokemon_type_id": "fire,flying",
                            "pokemon_type_name": "火,飞行"
                        },
                        {
                            "zukan_id": "0006",
                            "zukan_sub_id": 3,
                            "pokemon_name": "喷火龙",
                            "pokemon_sub_name": "超极巨化",
                            "weight": 999.99,
                            "height": 28,
                            "file_name": "/img/pm/2fd12098f15628cce80d411e090189aeb7d758ff.png",
                            "pokemon_type_id": "fire,flying",
                            "pokemon_type_name": "火,飞行"
                        },
                        {
                            "zukan_id": "0007",
                            "zukan_sub_id": 0,
                            "pokemon_name": "杰尼龟",
                            "pokemon_sub_name": "",
                            "weight": 9,
                            "height": 0.5,
                            "file_name": "/img/pm/5794f0251b1180998d72d1f8568239620ff5279c.png",
                            "pokemon_type_id": "water",
                            "pokemon_type_name": "水"
                        },
                        {
                            "zukan_id": "0008",
                            "zukan_sub_id": 0,
                            "pokemon_name": "卡咪龟",
                            "pokemon_sub_name": "",
                            "weight": 22.5,
                            "height": 1,
                            "file_name": "/img/pm/a3bc17e6215031332462cc64e59b7922ddd14b91.png",
                            "pokemon_type_id": "water",
                            "pokemon_type_name": "水"
                        },
                        {
                            "zukan_id": "0009",
                            "zukan_sub_id": 0,
                            "pokemon_name": "水箭龟",
                            "pokemon_sub_name": "",
                            "weight": 85.5,
                            "height": 1.6,
                            "file_name": "/img/pm/2fe157db59153af8abd636ab03c7df6f28b08242.png",
                            "pokemon_type_id": "water",
                            "pokemon_type_name": "水"
                        },
                        {
                            "zukan_id": "0009",
                            "zukan_sub_id": 1,
                            "pokemon_name": "超级水箭龟",
                            "pokemon_sub_name": "",
                            "weight": 101.1,
                            "height": 1.6,
                            "file_name": "/img/pm/00186af714a048895ba8116e71b08671c3cfb8f5.png",
                            "pokemon_type_id": "water",
                            "pokemon_type_name": "水"
                        },
                        {
                            "zukan_id": "0009",
                            "zukan_sub_id": 2,
                            "pokemon_name": "水箭龟",
                            "pokemon_sub_name": "超极巨化",
                            "weight": 999.99,
                            "height": 25,
                            "file_name": "/img/pm/50eba0f85c4e9a039be078e7de0b10acc7323264.png",
                            "pokemon_type_id": "water",
                            "pokemon_type_name": "水"
                        },
                        {
                            "zukan_id": "0010",
                            "zukan_sub_id": 0,
                            "pokemon_name": "绿毛虫",
                            "pokemon_sub_name": "",
                            "weight": 2.9,
                            "height": 0.3,
                            "file_name": "/img/pm/68f0cec6bcba20a0c53db3d8cfce81bd319d2c82.png",
                            "pokemon_type_id": "bug",
                            "pokemon_type_name": "虫"
                        },
                        {
                            "zukan_id": "0011",
                            "zukan_sub_id": 0,
                            "pokemon_name": "铁甲蛹",
                            "pokemon_sub_name": "",
                            "weight": 9.9,
                            "height": 0.7,
                            "file_name": "/img/pm/05fd4676fa4a4b58288510a97a5211e066e02464.png",
                            "pokemon_type_id": "bug",
                            "pokemon_type_name": "虫"
                        },
                        {
                            "zukan_id": "0012",
                            "zukan_sub_id": 0,
                            "pokemon_name": "巴大蝶",
                            "pokemon_sub_name": "",
                            "weight": 32,
                            "height": 1.1,
                            "file_name": "/img/pm/eacd20285cb634ba9fea41fc0fa13871c2fcbc66.png",
                            "pokemon_type_id": "bug,flying",
                            "pokemon_type_name": "虫,飞行"
                        },
                        {
                            "zukan_id": "0012",
                            "zukan_sub_id": 1,
                            "pokemon_name": "巴大蝶",
                            "pokemon_sub_name": "超极巨化",
                            "weight": 999.99,
                            "height": 17,
                            "file_name": "/img/pm/b76026363e301dbd8ac3f084e7d242232c46c95f.png",
                            "pokemon_type_id": "bug,flying",
                            "pokemon_type_name": "虫,飞行"
                        },
                        {
                            "zukan_id": "0013",
                            "zukan_sub_id": 0,
                            "pokemon_name": "独角虫",
                            "pokemon_sub_name": "",
                            "weight": 3.2,
                            "height": 0.3,
                            "file_name": "/img/pm/5ae74d403ec682eaf13e066850afd4b0c20d85f7.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0014",
                            "zukan_sub_id": 0,
                            "pokemon_name": "铁壳蛹",
                            "pokemon_sub_name": "",
                            "weight": 10,
                            "height": 0.6,
                            "file_name": "/img/pm/dd41f31a3c97f1f9d998361b125362584873157b.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0015",
                            "zukan_sub_id": 0,
                            "pokemon_name": "大针蜂",
                            "pokemon_sub_name": "",
                            "weight": 29.5,
                            "height": 1,
                            "file_name": "/img/pm/70f4206271b72492c9ba71d708d6183a80ba0e96.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0015",
                            "zukan_sub_id": 1,
                            "pokemon_name": "超级大针蜂",
                            "pokemon_sub_name": "",
                            "weight": 40.5,
                            "height": 1.4,
                            "file_name": "/img/pm/e12ce48ab99b2df6fbbc1e97038c4f6e192d09d7.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0016",
                            "zukan_sub_id": 0,
                            "pokemon_name": "波波",
                            "pokemon_sub_name": "",
                            "weight": 1.8,
                            "height": 0.3,
                            "file_name": "/img/pm/0e7c6e616404c683f00701b591eeab56e465641a.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0017",
                            "zukan_sub_id": 0,
                            "pokemon_name": "比比鸟",
                            "pokemon_sub_name": "",
                            "weight": 30,
                            "height": 1.1,
                            "file_name": "/img/pm/a2935587b7c61e6e6da88da3578d700c133246e5.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0018",
                            "zukan_sub_id": 0,
                            "pokemon_name": "大比鸟",
                            "pokemon_sub_name": "",
                            "weight": 39.5,
                            "height": 1.5,
                            "file_name": "/img/pm/01e13954dff668c1420407c98b308c81b83f6dda.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0018",
                            "zukan_sub_id": 1,
                            "pokemon_name": "超级大比鸟",
                            "pokemon_sub_name": "",
                            "weight": 50.5,
                            "height": 2.2,
                            "file_name": "/img/pm/dd6ab4ce8e7d05fb74e50cf66764e3ed8e11a097.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0019",
                            "zukan_sub_id": 0,
                            "pokemon_name": "小拉达",
                            "pokemon_sub_name": "",
                            "weight": 3.5,
                            "height": 0.3,
                            "file_name": "/img/pm/3e4b38ab7545ebd938154d9aed9502cb068569d6.png",
                            "pokemon_type_id": "normal",
                            "pokemon_type_name": "一般"
                        },
                        {
                            "zukan_id": "0019",
                            "zukan_sub_id": 1,
                            "pokemon_name": "小拉达",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 3.8,
                            "height": 0.3,
                            "file_name": "/img/pm/3567693e3479fb0cf15b9ec84ee8a033aa7b4310.png",
                            "pokemon_type_id": "dark,normal",
                            "pokemon_type_name": "恶,一般"
                        },
                        {
                            "zukan_id": "0020",
                            "zukan_sub_id": 0,
                            "pokemon_name": "拉达",
                            "pokemon_sub_name": "",
                            "weight": 18.5,
                            "height": 0.7,
                            "file_name": "/img/pm/e97c62e4e4b46017be60806d00f4d389d003f115.png",
                            "pokemon_type_id": "normal",
                            "pokemon_type_name": "一般"
                        },
                        {
                            "zukan_id": "0020",
                            "zukan_sub_id": 1,
                            "pokemon_name": "拉达",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 25.5,
                            "height": 0.7,
                            "file_name": "/img/pm/a30454b7040a4a517bfe0914777e2e7c045f6c65.png",
                            "pokemon_type_id": "dark,normal",
                            "pokemon_type_name": "恶,一般"
                        },
                        {
                            "zukan_id": "0021",
                            "zukan_sub_id": 0,
                            "pokemon_name": "烈雀",
                            "pokemon_sub_name": "",
                            "weight": 2,
                            "height": 0.3,
                            "file_name": "/img/pm/e815cb4b8ba9c2d0841dfa364c87164880944e3a.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0022",
                            "zukan_sub_id": 0,
                            "pokemon_name": "大嘴雀",
                            "pokemon_sub_name": "",
                            "weight": 38,
                            "height": 1.2,
                            "file_name": "/img/pm/8b326a6f77b73b3c250ba95f3a97fc21b28c8f4b.png",
                            "pokemon_type_id": "normal,flying",
                            "pokemon_type_name": "一般,飞行"
                        },
                        {
                            "zukan_id": "0023",
                            "zukan_sub_id": 0,
                            "pokemon_name": "阿柏蛇",
                            "pokemon_sub_name": "",
                            "weight": 6.9,
                            "height": 2,
                            "file_name": "/img/pm/ad90ec632849d032615d707ebe8ad741651eee06.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0024",
                            "zukan_sub_id": 0,
                            "pokemon_name": "阿柏怪",
                            "pokemon_sub_name": "",
                            "weight": 65,
                            "height": 3.5,
                            "file_name": "/img/pm/eb3c14ed44c1e4a2ba4c2d7970cddf07cd8ef67f.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0025",
                            "zukan_sub_id": 0,
                            "pokemon_name": "皮卡丘",
                            "pokemon_sub_name": "",
                            "weight": 6,
                            "height": 0.4,
                            "file_name": "/img/pm/2b3f6ff00db7a1efae21d85cfb8995eaff2da8d8.png",
                            "pokemon_type_id": "electric",
                            "pokemon_type_name": "电"
                        },
                        {
                            "zukan_id": "0025",
                            "zukan_sub_id": 1,
                            "pokemon_name": "皮卡丘",
                            "pokemon_sub_name": "超极巨化",
                            "weight": 999.99,
                            "height": 21,
                            "file_name": "/img/pm/a90881f103830615ee7f85e16fe9f586d41f2332.png",
                            "pokemon_type_id": "electric",
                            "pokemon_type_name": "电"
                        },
                        {
                            "zukan_id": "0026",
                            "zukan_sub_id": 0,
                            "pokemon_name": "雷丘",
                            "pokemon_sub_name": "",
                            "weight": 30,
                            "height": 0.8,
                            "file_name": "/img/pm/9c28defa939e230800ec0d0c421d9f82c60df77a.png",
                            "pokemon_type_id": "electric",
                            "pokemon_type_name": "电"
                        },
                        {
                            "zukan_id": "0026",
                            "zukan_sub_id": 1,
                            "pokemon_name": "雷丘",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 21,
                            "height": 0.7,
                            "file_name": "/img/pm/8be55a3ff2b24890fac0b9e2415dda9d0f893c1f.png",
                            "pokemon_type_id": "electric,psychic",
                            "pokemon_type_name": "电,超能力"
                        },
                        {
                            "zukan_id": "0027",
                            "zukan_sub_id": 0,
                            "pokemon_name": "穿山鼠",
                            "pokemon_sub_name": "",
                            "weight": 12,
                            "height": 0.6,
                            "file_name": "/img/pm/f5fcf7a292a180320138ace7235f8a2c16f6594a.png",
                            "pokemon_type_id": "ground",
                            "pokemon_type_name": "地面"
                        },
                        {
                            "zukan_id": "0027",
                            "zukan_sub_id": 1,
                            "pokemon_name": "穿山鼠",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 40,
                            "height": 0.7,
                            "file_name": "/img/pm/d9ea1612a6ec53ba12e2d9abe28f99e66021bde1.png",
                            "pokemon_type_id": "ice,steel",
                            "pokemon_type_name": "冰,钢"
                        },
                        {
                            "zukan_id": "0028",
                            "zukan_sub_id": 0,
                            "pokemon_name": "穿山王",
                            "pokemon_sub_name": "",
                            "weight": 29.5,
                            "height": 1,
                            "file_name": "/img/pm/d00d72f082b7dae546fa8bd5cf09fcfe53ffcae8.png",
                            "pokemon_type_id": "ground",
                            "pokemon_type_name": "地面"
                        },
                        {
                            "zukan_id": "0028",
                            "zukan_sub_id": 1,
                            "pokemon_name": "穿山王",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 55,
                            "height": 1.2,
                            "file_name": "/img/pm/cc154af4dcd20d14aba494a6a679f528bb9f3d6d.png",
                            "pokemon_type_id": "ice,steel",
                            "pokemon_type_name": "冰,钢"
                        },
                        {
                            "zukan_id": "0029",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多兰",
                            "pokemon_sub_name": "",
                            "weight": 7,
                            "height": 0.4,
                            "file_name": "/img/pm/14179c8ab9c2003fc5b27a29e91e4cd195283d52.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0030",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多娜",
                            "pokemon_sub_name": "",
                            "weight": 20,
                            "height": 0.8,
                            "file_name": "/img/pm/fed980fd2341745923812e9dcd88a039aaaf36ea.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0031",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多后",
                            "pokemon_sub_name": "",
                            "weight": 60,
                            "height": 1.3,
                            "file_name": "/img/pm/5174a41a9db00baf5dd664c92a12254b0baa5fde.png",
                            "pokemon_type_id": "poison,ground",
                            "pokemon_type_name": "毒,地面"
                        },
                        {
                            "zukan_id": "0032",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多朗",
                            "pokemon_sub_name": "",
                            "weight": 9,
                            "height": 0.5,
                            "file_name": "/img/pm/237579eaf2141edad61d647c62f074d53653337b.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0033",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多力诺",
                            "pokemon_sub_name": "",
                            "weight": 19.5,
                            "height": 0.9,
                            "file_name": "/img/pm/f3d8e45646fb05516dff845922c3d62d9aa33cbe.png",
                            "pokemon_type_id": "poison",
                            "pokemon_type_name": "毒"
                        },
                        {
                            "zukan_id": "0034",
                            "zukan_sub_id": 0,
                            "pokemon_name": "尼多王",
                            "pokemon_sub_name": "",
                            "weight": 62,
                            "height": 1.4,
                            "file_name": "/img/pm/ce24d9eb27f4e554ea5bd29840a35957f7bd9d30.png",
                            "pokemon_type_id": "poison,ground",
                            "pokemon_type_name": "毒,地面"
                        },
                        {
                            "zukan_id": "0035",
                            "zukan_sub_id": 0,
                            "pokemon_name": "皮皮",
                            "pokemon_sub_name": "",
                            "weight": 7.5,
                            "height": 0.6,
                            "file_name": "/img/pm/18e9dc86ced1320d6846f2c192c4eb04e517963a.png",
                            "pokemon_type_id": "fairy",
                            "pokemon_type_name": "妖精"
                        },
                        {
                            "zukan_id": "0036",
                            "zukan_sub_id": 0,
                            "pokemon_name": "皮可西",
                            "pokemon_sub_name": "",
                            "weight": 40,
                            "height": 1.3,
                            "file_name": "/img/pm/1865f85f9e417522f8de1a239fbff27f2106783b.png",
                            "pokemon_type_id": "fairy",
                            "pokemon_type_name": "妖精"
                        },
                        {
                            "zukan_id": "0037",
                            "zukan_sub_id": 0,
                            "pokemon_name": "六尾",
                            "pokemon_sub_name": "",
                            "weight": 9.9,
                            "height": 0.6,
                            "file_name": "/img/pm/f285c634efd141918f6ad066a6f59c20746d9050.png",
                            "pokemon_type_id": "fire",
                            "pokemon_type_name": "火"
                        },
                        {
                            "zukan_id": "0037",
                            "zukan_sub_id": 1,
                            "pokemon_name": "六尾",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 9.9,
                            "height": 0.6,
                            "file_name": "/img/pm/89719dbcbddd11a1e6bc5f4366e00910a04eaf9f.png",
                            "pokemon_type_id": "ice",
                            "pokemon_type_name": "冰"
                        },
                        {
                            "zukan_id": "0038",
                            "zukan_sub_id": 0,
                            "pokemon_name": "九尾",
                            "pokemon_sub_name": "",
                            "weight": 19.9,
                            "height": 1.1,
                            "file_name": "/img/pm/cc96e6a4eee980724ebd725bb8785334d3290074.png",
                            "pokemon_type_id": "fire",
                            "pokemon_type_name": "火"
                        },
                        {
                            "zukan_id": "0038",
                            "zukan_sub_id": 1,
                            "pokemon_name": "九尾",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 19.9,
                            "height": 1.1,
                            "file_name": "/img/pm/397b20ea73c8358185d6f1d2971b5825b0cb0baf.png",
                            "pokemon_type_id": "ice,fairy",
                            "pokemon_type_name": "冰,妖精"
                        },
                        {
                            "zukan_id": "0039",
                            "zukan_sub_id": 0,
                            "pokemon_name": "胖丁",
                            "pokemon_sub_name": "",
                            "weight": 5.5,
                            "height": 0.5,
                            "file_name": "/img/pm/7a2bec0dd522d66353f0cf3df9148070456a3349.png",
                            "pokemon_type_id": "normal,fairy",
                            "pokemon_type_name": "一般,妖精"
                        },
                        {
                            "zukan_id": "0040",
                            "zukan_sub_id": 0,
                            "pokemon_name": "胖可丁",
                            "pokemon_sub_name": "",
                            "weight": 12,
                            "height": 1,
                            "file_name": "/img/pm/b3724395d41de1d0def948966c69148bd9f0f9c1.png",
                            "pokemon_type_id": "normal,fairy",
                            "pokemon_type_name": "一般,妖精"
                        },
                        {
                            "zukan_id": "0041",
                            "zukan_sub_id": 0,
                            "pokemon_name": "超音蝠",
                            "pokemon_sub_name": "",
                            "weight": 7.5,
                            "height": 0.8,
                            "file_name": "/img/pm/5d54b9d9cefa287ea258517537ba26f4103dda36.png",
                            "pokemon_type_id": "poison,flying",
                            "pokemon_type_name": "毒,飞行"
                        },
                        {
                            "zukan_id": "0042",
                            "zukan_sub_id": 0,
                            "pokemon_name": "大嘴蝠",
                            "pokemon_sub_name": "",
                            "weight": 55,
                            "height": 1.6,
                            "file_name": "/img/pm/cedbf9afd3155d3df1e2ffebf049902598ebd74b.png",
                            "pokemon_type_id": "poison,flying",
                            "pokemon_type_name": "毒,飞行"
                        },
                        {
                            "zukan_id": "0043",
                            "zukan_sub_id": 0,
                            "pokemon_name": "走路草",
                            "pokemon_sub_name": "",
                            "weight": 5.4,
                            "height": 0.5,
                            "file_name": "/img/pm/6bad448cb0997a928b94e72b67eacb861271f796.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0044",
                            "zukan_sub_id": 0,
                            "pokemon_name": "臭臭花",
                            "pokemon_sub_name": "",
                            "weight": 8.6,
                            "height": 0.8,
                            "file_name": "/img/pm/62973d0fc5f9bd5d8c819b8c885bd1f216983ff1.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0045",
                            "zukan_sub_id": 0,
                            "pokemon_name": "霸王花",
                            "pokemon_sub_name": "",
                            "weight": 18.6,
                            "height": 1.2,
                            "file_name": "/img/pm/a95af5f577260373074117cb756e5ea38cd674ef.png",
                            "pokemon_type_id": "grass,poison",
                            "pokemon_type_name": "草,毒"
                        },
                        {
                            "zukan_id": "0046",
                            "zukan_sub_id": 0,
                            "pokemon_name": "派拉斯",
                            "pokemon_sub_name": "",
                            "weight": 5.4,
                            "height": 0.3,
                            "file_name": "/img/pm/837bcac8efc9329d9e3b9e46e95670a5d493b60a.png",
                            "pokemon_type_id": "bug,grass",
                            "pokemon_type_name": "虫,草"
                        },
                        {
                            "zukan_id": "0047",
                            "zukan_sub_id": 0,
                            "pokemon_name": "派拉斯特",
                            "pokemon_sub_name": "",
                            "weight": 29.5,
                            "height": 1,
                            "file_name": "/img/pm/e5838e76eb33d88601ba9d6e045e1bdf7e20f46a.png",
                            "pokemon_type_id": "bug,grass",
                            "pokemon_type_name": "虫,草"
                        },
                        {
                            "zukan_id": "0048",
                            "zukan_sub_id": 0,
                            "pokemon_name": "毛球",
                            "pokemon_sub_name": "",
                            "weight": 30,
                            "height": 1,
                            "file_name": "/img/pm/8b550ab54d22a87dc784ee1af6cff4ad33aa10a2.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0049",
                            "zukan_sub_id": 0,
                            "pokemon_name": "摩鲁蛾",
                            "pokemon_sub_name": "",
                            "weight": 12.5,
                            "height": 1.5,
                            "file_name": "/img/pm/c57d464a64424f031a9872f2ec3f7c0b8052d3c1.png",
                            "pokemon_type_id": "bug,poison",
                            "pokemon_type_name": "虫,毒"
                        },
                        {
                            "zukan_id": "0050",
                            "zukan_sub_id": 0,
                            "pokemon_name": "地鼠",
                            "pokemon_sub_name": "",
                            "weight": 0.8,
                            "height": 0.2,
                            "file_name": "/img/pm/583fa625d6fda586a5734f5f9e455952aa6af15f.png",
                            "pokemon_type_id": "ground",
                            "pokemon_type_name": "地面"
                        },
                        {
                            "zukan_id": "0050",
                            "zukan_sub_id": 1,
                            "pokemon_name": "地鼠",
                            "pokemon_sub_name": "阿罗拉的样子",
                            "weight": 1,
                            "height": 0.2,
                            "file_name": "/img/pm/19bd3a09933b3e9a0a7156ef294091922dbf771e.png",
                            "pokemon_type_id": "ground,steel",
                            "pokemon_type_name": "地面,钢"
                        }
                ]
                """;


        return JSONArray.parseArray(str);
    }
}
