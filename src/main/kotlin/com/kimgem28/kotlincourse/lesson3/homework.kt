package com.kimgem28.kotlincourse.lesson3

val event: String = "Happy cake day!";// Название мероприятия
val date: String = "30.11.2024";// Дата проведения
val place: String = "Moscow, St.Akhmetova 28";// Место проведения
var budget: String = "1000000rub";// Бюджет
lateinit var member: String;// Количество участников
val eventTime: String = "180min";// Длительность хакатона
val contactInf: String = "C:\\Program Files\\Common Files\\Contacts"
    get() {
        if(accessContactTest()) return field
        else return "access denial"
    };// Контактная информация
lateinit var status: String;// Текущее состояние хакатона
lateinit var sponsor: String;// Список спонсоров
val internet: String = "internet access"
    get() {
        if(internetTest()) return field
        else return "internet absent"
    };// Текущий уровень доступа к интернету
var teamNumb: Int = 3;// Количество команд
val evacuationScheme: String = "C:\\Program Files\\Common Files\\Evacuation scheme";// План эвакуации
val equipmentList: String = "Refrigerator 2p, stove 4p, refrigerated display cases 4p";// Список доступного оборудования
var freeEquip: String = "Refrigerator 2p, stove 4p, refrigerated display cases 4p";
get() {
    if(equipTest()) return field
    else return ""
}// Список доступного оборудования
val mealSchedule: String by lazy {
    ""
};// Расписание питания
lateinit var juryList: String;// Список жюри и экспертов
var accessRequest: String = "C:\\Program Files\\Common Files\\Coordination teams"
get() {
    if (accessTest()) return field
    else return "access denial"
};// Координация команд поддержки
lateinit var logs: String;
var relaxPlace: Int = 0
    get() = field
    set(value) {
        if(value > 0) field += value
    };// Количество доступных мест



















