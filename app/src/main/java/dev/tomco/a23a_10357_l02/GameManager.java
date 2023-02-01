package dev.tomco.a23a_10357_l02;

import java.util.ArrayList;

public class GameManager {
    private boolean isLocked;

    private int[] flags = new int[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            R.drawable.sem1_y_2022_8_img,
            R.drawable.sem1_y_2022_9_img,
            R.drawable.sem1_y_2022_10_img,
            R.drawable.sem1_y_2022_11_img,
            R.drawable.sem1_y_2022_12_img,
            R.drawable.sem1_y_2022_13_img,
            R.drawable.sem1_y_2022_14_img, 0,0,0,0,
            0, R.drawable.sem1_y_2022_20_img, 0, 0, 0,
            0, 0, 0, 0, 0, 0
    };

    private String[] names = new String[]{
            "סוכנות נסיעות מבקשת לפתח מערכת הזמנות שתפעל באינטרנט. מערכת הזמנות זו תאפשר ללקוחותלעקוב בצורה מאובטחת אחר כל הזמנות הנסיעות שלהם עבור חברות תעופה, מלונות, ומכוניות שכורות.\n" +
                    "כמו כן, המערכת תאפשר לסוכני הנסיעות להכין את ההזמנות ולעדכן אותן בהתאם לשינויי המצבודרישות הלקוחות.\n" +
                    "איזה מהאפשרויות הבאות מתאר תרחיש שימוש עיקרי (Use Case)?\n",
            "סוכנות מכוניות החליטה למחשב את מערך התמיכה לאנשי המכירות שלה. הדרישות הפונקציונליות של המערכת הן:\n" +
                    "ניהול קטלוג מכוניות חדשות ומשומשות על פי יצרן ודגם\n" +
                    "איסוף אינפורמציה היסטורית על תיקונים אשר מכוניות משומשות עברו\n" +
                    "איסוף אינפורמציה על המכוניות שנמכרו עבור ההנהלה חישוב רווח והפסד בהתאם ליצרן ודגם המכונית\n" +
                    "חישוב עמלה לאנשי מכירות בהתאם לאחוז עמלה וההנחה שאיש המכירות נתן לקונה\n" +
                    "מיהם השחקנים במערכת זו?\n",
            "מכון כושר משתמש במערכת לרישום מתעמלים לחוגים. המערכת מאפשרת למנוייה להירשם לחוגיםולנהל את הרישום (להקפיא, לבטל וכו') שלהם. המערכת גובה תשלום לכל חוג. המערכת גם מבטיחהשמתעמלים לא ירשמו בו זמנית לחוגים שמתקיימים באותו המועד. הגדרנו למערכת תרחיש שימוש (UseCase) של רישום לחוג.\n" +
                    "איזה זרימה חלופית (alternate flow) לא תתאים ל-Use case זה?\n",
            "לפניכם זרימה מתוך תרחיש שימוש של הזמנת כרטיסים לסרט:\n" +
                    "1.\tThe Customer reviews the list of available movies\n" +
                    "2.\tThe Customer selects a movie and a screening date\n" +
                    "3.\tThe Customer selects seats in the theatre\n" +
                    "4.\tThe Customer confirms and pays for the tickets.\n,מה השגיאה בזרימה הנ\"ל?",
            "במסמך הדרישות של מערכת ה-moodle במכללה הוגדרה בפרק הדרישות הלא פונקציונליות הדרישה הבאה: המערכת תגיב במהירות לכל בקשה של הצגת גיליון ציונים. מה הבעיה בהגדרת דרישה זו?",
            "במשחק מחשב השחקן מזיז דמות ורואה את הייצוג שלה על המסך. איך נתאר זאת בעזרת אובייקטים\n" +
                    "?Entity/Boundary/Control על פי השיטה של\n",
            "בטלסקופ החלל החדשJames Webb  יש מערכת לפתיחת מגן השמש. למערכת יש מנועים (actuators)שבעזרתם אפשר לפרוס (to deploy) את המגן וחיישנים (sensors) שמדווחים על מצב הפריסה. בנוסףהמערכת עוקבת אחרי טמפרטורת הטלסקופ ואחרי מצב הסוללות שלו. נרצה לתאר את המערכת במונחיםשל אובייקטים. מי מהאובייקטים הבאים יהיו אובייקטיBoundary  במערכת זו?",
            "האיור הבא הוא חלק מתרשים רצף (sequence diagram) שמתאר משיכת כסף מזומן מכספומט: למרבה הצער התרשים שגוי. מהי הטעות שבתרשים?",
            "התבוננו בתרשים הרצף (sequence diagram) הבא: איזה טעות נפלה בתרשים?",
            "התבוננו בדיאגרמת המצבים הבאה: כיצד אפשר לתאר את הדיאגרמה בצורה פשוטה יותר מבלי לשנות את ההתנהגות המתוארת בה?",
            "כזכור, כל מצב בדיאגרמת מצבים מתאר קבוצת מצבים של אובייקט. התבוננו בדיאגרמת המצביםהבאה עבור אובייקט כלשהוX : נניח שהאובייקט קיבל את האירועיםe1, e2, e1  (לפי הסדר). מה נוכל לומר על מצב האובייקט?",
            "התבוננו בדיאגרמת המחלקות הבאה אשר מתארת חלק ממודל הנתונים של מערכת לניהול סוכנותלמכירת מכוניות משומשות: מי מהטענות הבאות סותרת את המגבלות המתוארות בדיאגרמה?",

            "אליס ובוב מתכננים מערכת לניהול מרפאה. הם רוצים לאפשר לרופא לטפל באותו מטופל יותר מפעם אחת בתאריכים שונים. המטופל גם יכול להיות מטופל על ידי רופאים שונים. בוב הכין את דיאגרמת המחלקות הבאה כדי לתאר את מבנה הנתונים במערכת, אבל אליס חושדת שנפלה בדיאגרמה טעות: עזרו לאליס. איזה טעות נפלה בדיאגרמה?",
            "בתבנית ה-MVC המקורית יש קשר חד-חד-ערכי בין ה-Views ל-Controllers, ה-Views מאורגניםבמבנה של עץ ולכלView  יש לכל היותר אובייקטModel  יחיד. בוב צייר את הדיאגרמה הבאה כדי להסבירלאליס את מבנה תבנית ה-MVC המקורית: לצערנו נפלה שגיאה בדיאגרמה שבוב הכין. מהי השגיאה שעשה בוב?",

            "במערכת לניהול עבודה במעבדה לתיקון מכשירי טלפון ניידים, החליטו להגדיר תת מערכת שתפקידהלאפשר לנציגי השירות לפתוח כרטיסי תיקון ולטכנאי המעבדה להזין בתחילת כל יום את שעת הגעתם.\n" +
                    "בנוסף, תת המערכת תשמור פרטים על הלקוחות שהזמין את התיקון, על דגם המכשיר, מהות התקלה,משך זמן התיקון והעלות שלו. מאיזה בעיה סובלת תת מערכת זו?\n",
            "מי מהטכניקות הבאות לא מממשת את עקרון ה-Open/Closed?",
            "אליס ובוב מתווכחים האם לחלק את תת מערכת העיבוד הגרפי של משחק פעולה ל-10 שכבות או ל-3שכבות במודל שכבות סגור. איזה נימוק אפשר להעלות לטובת שימוש בפחות שכבות (3) לעומת יותר (10)שכבות?",
            "אליס ובוב מפתחים מערכת למגדל פיקוח בשדה תעופה למטוסים קלים. המערכת צריכה לעקוב אחרי מיקומי המטוסים ולשלוח להם עדכוני מסלול כדי למנוע התנגשויות (למטוסים קלים אין מערכת מניעת התנגשות משלהם). באיזה סגנון ארכיטקטוני צריך לתכנן את המערכת?",
            "מה ההבדל בין מודל שכבות סגור לתבנית ארכיטקטוניתpipe & filter ?",
            "התבוננו בתרשים הרצף הבא המתאר מערכת של קופות רושמות בסופרמרקט: בתרשים זה האובייקטיםA  ו-B מתארים תתי מערכות הנמצאות בקופות ושולחות את תנועות(transactions) הרכישה לתת מערכתC  ששומרת את כל התנועות בבסיס נתונים.\n" +
                    "לאיזה תבנית ארכיטקטונית מתאים התרשים?\n",
            "בוב הציע לאליס להשתמש במחלקה הקונקרטיתHashSet  במקום בממשקSet  כדי לייצג את קבוצתהעובדים במחלקהCompany . אליס טוענת ששימוש ב-HashSet יפר את עקרון ה-SOLID . איזה מעקרונותSOLID הוא יפר?",
            "אליס ובוב מפתחים משחק מחשב. אליס החליטה שבמקום שהתנהגות הדמויות תוגדר ישירות בקודהמערכת, היא תספק שפתscript  (שפת תכנות ייעודית) להגדרת התנהגות הדמויות במשחק, ואז גםהמפתחים וגם שחקנים יוכלו להוסיף ולשנות את התנהגות הדמויות מבלי שיהיה צורך לשנות את קודהמערכת. איזה עקרוןSOLID  מיישמת אליס?",
            "בעזרת איזה עקרוןSOLID  אפשר להסביר את ההיגיון מאחורי חלוקת האובייקטים לשלושת הסוגים\n" +
                    "?Entity, Boundary, Control של\n",
            "במערכת לניהול פרויקטי גמר במכללה, תהליך פרויקט הגמר דורש שהפרוייקטור יאשר ויחתום עלהצעות הפרויקטים שמגישים הסטודנטים לפני שהפרויקט יכול להתחיל. לאחר שהפרויקט התחיל,המערכת משרתת את הסטודנטים והמנחים והפרוייקטור לא מעורב יותר. הסטודנטים מגישים מסמכים למערכת והמנחים בודקים אותם ומזינים למערכת ציונים. כחלק מפעולתה המערכת מזינה את ציוני הפרויקטים למערכת הציונים הכללית של המכללה. מי מהשחקנים הבאים אינו שחקן ראשי במערכת?", "ברצוננו לכתוב תרחיש שימוש (Use Case) עבור מטרת מערכת כלשהי. היכן יש לתאר כיצד המערכתמתמודדת עם שיבושים ובעיות בהשגת מטרת תרחיש השימוש ?", "אנחנו מתכננים מערכת תוכנה למשלוחי פיצות לבתי הלקוחות עבור רשת פיצות בעלת סניפים רבים.\\nלאחר שהלקוח יזמין את הפיצה שלו מאתר הסניף הקרוב למקום מגוריו, אחראי המשמרת יעביר אתכתובת הלקוח לרחפן וזה ינווט בעזרת מערכתGPS  עד לביתו של הלקוח. שם יקח ממנו הלקוח את הפיצהוהרחפן יחזור חזרה לסניף. מי הם האובייקטים במערכת זו?\\n", "ברצוננו לפתח מערכת לניהול העבודה במעבדה לתיקון מכשירי טלפון ניידים. המערכת מאפשרת לנציגיהשירות לפתוח כרטיסי תיקון ולטכנאי המעבדה לעדכן את התקדמות תהליך התיקון. בתחילת כל יוםהטכנאים מזינים למערכת את שעת הגעתם. בנוסף, המערכת שומרת פרטים על הלקוח שהזמין אתהתיקון, על דגם המכשיר, מהות התקלה, משך זמן התיקון והעלות שלו. מי מהמושגים הבאים הוא אובייקטBoundary  במערכת זו?", "התבוננו בתיאור המערכת הבא:\nAlice designs a system to manage record collections. She plans to create a catalog of records with the following details: the record\"s name, the company that produced the record, the authors, performers, length and style.  Listeners can browse the catalog, select a record and ask the system to play the record.\nמי מהבאים הוא אובייקטEntity  במערכת על פי התיאור הנ''ל?\n", "איזו התנהגות אינה מותרת על פי המודל שלentity boundary control ?"
    };

    private int[] scores = new int[]{
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            30,
            30,
            30,
            30,
            30,
            30,
            30,           10,
            10,
            10,
            10,
            10,
            10,

    };

    private String[] ans1 = new String[]{
            "כניסה למערכת (login).",
            "לקוחות.",
            "אמצעי התשלום של המתעמל אינו תקין.",
            "חסר תיאור של התנהגות המערכת.",
            "זו דרישה לא לגיטימית מכיוון שאף טכנולוגיה לא יכולה באמת להבטיח שבזמן עומס המערכתתוכל להגיב מספיק מהר.",
            "נגדיר אובייקטBoundary  יחיד שיציג את הדמות על המסך וגם ישמור את פרטי המיקום שלה.",
            "Actuator, Sensor.",
            "חסר בתרשים אובייקטControl .",
            "אובייקט ה-Controller שולח הודעה לאובייקט Boundary",
            "לרשום את הפעולה (action) ב-exit של המצבA .",
            "הוא נמצא במצבB .",
            "יתכן שלסוכנות הנסיעות לא יהיו כלל רכבים.",
            "כשמשתמשים ב-association class הקישור בין המחלקות (Doctor - Patient) צריך להיות יחיד ליחיד.",
            "בדיאגרמה של בוב יתכנוViews  ללאsuperView .",
            "לכידות גבוהה.",
            "ארגון המערכת לפי מודל שכבות סגור.",
            "מספר רב של שכבות בהכרח יעלה את מורכבות הפיתוח.",
            "ארכיטקטורת Peer to Peer שבה כל מטוס מתקשר עם מגדל הפיקוח לקבל עדכון על מיקומו ואז מעביר את מיקומו לכל המטוסים האחרים בסביבתו.",
            "במודל שכבות סגור אין אפשרות להוסיף שכבות מרגע שהמערכת כתובה, בעוד שבמודל pipe&filter אפשר להחליף בין ה-filters גם אחרי שהמערכת כתובה.",
            "Repository.",
            "Single Responsibility Principle.",
            "Dependency Inversion Principle.",
            "Interface Segregation principle.",
            "הפרוייקטור.", "בזרימות האלטרנטיביות של תרחיש השימוש.", "השרת שמחזיק את אתר הסניף והרחפן.", "טכנאי.", "Listeners.", "שליחת הודעות מ-Boundary ל-Control.",



    };
    private String[] ans2 = new String[]{
            "הכנת תוכנית נסיעה עבור לקוח.",
            "אנשי מכירות.",
            "למתעמל יש בעיה בריאותית וחסרים לו אישורים רפואיים מתאימים.",
            "חסרה התמודדות עם מצבים חריגים (כמו למשל, שאין כבר מקום באולם).",
            "הדרישה לא שלמה עד שלא מספקים גם מידע על סוג בסיס הנתונים שבו נשתמש (כדי לקבוע אתמהירות שליפת הנתונים).",
            "נגדיר אובייקטControl  שיחזיק את פרטי מיקום הדמות, ואובייקטBoundary  שיציג את הדמותעל המסך.",
            "Battery, Temperature.",
            "השחקן Bank שולח הודעה לאובייקט WithdrawRequest במקום להיפך.",
            "אובייקטa2  שולח הודעהdone   כ-reply ל-Controller מבלי שקיבל ממנו הודעה יזומה.",
            "להחליף את האירועיםa,b,c  באירוע אחד משותף שנקרא inc .",
            "הוא נמצא במצביםA,B,C .",
            "יתכן ומכונית תיבדק רק במוסך אחד.",
            "חסרים קישורים ישירים בין ה-association class לבין המחלקותPaitent  ו-Doctor.",
            "בדיאגרמה של בוב לא מצוין כמהControllers  יש לכלModel .",
            "לכידות נמוכה.",
            "פיצול מחלקה לנושאים נפרדים על פי עקרון ה-Single Responsibility.",
            "מספר רב של שכבות יגרום לירידה בביצועים.",
            "ארכיטקטורת Pipes and Filters שבה ההודעות עוברות ממגדל הפיקוח למטוס הראשון וממנו לאחרים על פי סדר שנקבע מראש.",
            "בתבנית pipe&filter קובעים מראש את כמות ה-filters בעוד שבמודל שכבות סגור אין צורךלקבוע מראש את כמות השכבות.",
            "Blackboard.",
            "Interface Segregation Principle.",
            "Open Closed Principle.",
            "Single Responsibility principle.",
            "מערכת הציונים הכללית של המכללה.", "כחלק מהזרימה הראשית של תרחיש השימוש.", "ניהול הזמנת פיצה, טופס כתובת הלקוח, סניף.", "משך זמן התיקון.", "Record length.", "שליחת הודעות מ-Entity ל-Entity.",

    };

    private String[] ans3 = new String[]{
            "שדרוג בסיס הנתונים של הזמנות הנסיעות.",
            "בסיסי נתונים.",
            "למתעמל יש כבר חוג אשר מתקיים באותו מועד.",
            "חסר תיאור של ממשק המשתמש.",
            "זו דרישה פונקציונלית, וצריך להגדיר אותה באמצעותUse Case .",
            "נגדיר אובייקטBoundary  שיציג את הדמות על המסך ואובייקטEntity  שישמור את מיקום הדמות",
            "Deployment manager.",
            "אובייקט ה-Transaction צריך ליצור את אובייקט ה-WithdrawForm ולא להיפך.",
            "אובייקט ה-Controller יוצר אובייקט Entity ",
            "לרשום את הפעולה (action) ב-exit של המצביםA,B,C .",
            "הוא נמצא במצביםC  ו-A.",
            "למכונית יכולות להיות בדיקות (inspections) רבות באותו המוסך.",
            "השימוש ב-association class מאפשר רק ביקור אחד בין אותו רופא (Doctor) ואותו מטופל (Patient)",
            "בדיאגרמה של בוב לכלModel  יתכנו הרבהViews .",
            "צימוד נמוך.",
            "ארגון מחלקות על פי עקרוןLiskov Substitution .",
            "מספר מועט של שכבות ישפר את הלכידות של תתי המערכות.",
            "ארכיטקטורת Client/Server שבה כל מטוס צריך לבקש ממגדל הפיקוח מידע על סיכונים אפשריים בסביבתו.",
            "במודל שכבות סגור כמות השכבות מוגבלת בעוד שבתבנית pipe&filter אין מגבלה על כמות ה-Filters.",
            "Pipe & Filter.",
            "Open/Closed Principle.",
            "Single Responsibility Principle.",
            "Dependency inversion principle.",
            "המנחים.", "יש לתאר זאת בנספח נפרד (מחוץ לכל תרחיש שימוש) שנושאו טיפול בבעיות ושיבושים.", "מערכת ה-GPS והרחפן.", "מכשיר טלפון נייד.", "New record details form.", "שליחת הודעות מ-Entity ל-Boundary.",

    };

    private String[] ans4 = new String[]{
            "עדכון סיסמה חזקה ללקוח הסוכנות.",
            "מכוניות.",
            "המתעמל מעוניין לבטל חוג קיים.",
            "חסר תיאור של בסיס הנתונים שבו נשמרים נתוני המערכת.",
            "דרישה זו לא יכולה להיבדק.",
            "נגדיר אובייקטEntity  שישמור את מיקום הדמות כחלק מפרטי השחקן, ואובייקטBoundary שיציג את המידע של השחקן וכחלק מתצוגה זו גם יציג את הדמות על המסך.",
            "Telescope, Sun Shield.",
            "חסרים בתרשים פרמטרים שמועברים להודעות/מתודות של האובייקטים השונים.",
            "אובייקט a1 שולח הודעה לאובייקט Entity  אחר",
            "לרשום את הפעולה (action) ב-entry של מצבD .",
            "הוא נמצא במצביםC  ו-B.",
            "למכונית תיתכן רק בדיקה (inspection) יחידה באותו מוסך.",
            "כשמשתמשים ב-association class חייבים להגדיר גם qualified attribute.",
            "בדיאגרמה של בוב לכלView  יתכנו הרבה מודלים.",
            "צימוד גבוה.",
            "העברת קבועים מתוך הקוד לקובץ חיצוני שנטען בזמן ריצה.",
            "מספר מועט של שכבות יקל על השימוש בספריות חיצוניות.",
            "ארכיטקטורת Blackboard שבה מגדל הפיקוח יאסוף את נתוני הטיסה של כל המטוסים וישלח לכולם עדכוני מסלול.",
            "במודל שכבות סגור כל שכבה מכירה את הממשק של השכבה שמתחתיה, בעוד שבתבנית pipe&filter תתי מערכות ה-filter מבודדות לחלוטין זו מזו.",
            "4 Tier.",
            "Dependency Inversion Principle.",
            "Liskov Substitution Principle.",
            "Liskov Substitution principle.",
            "הסטודנטים.", "בתרחיש שימוש (Use Case) נפרד שאין לו קשר לתרחיש הנוכחי.", "אחראי המשמרת, הפיצה, הלקוח.", "טופס פתיחת כרטיס תקלה.", "Record.", "שליחת הודעות משחקן ל-Boundary.",


    };

    private int[] answers = new int[]{
            2,
            2,
            4,
            1,
            4,
            3,
            1,
            1,2,4,4,4,3,
            4,2,2,2,4,
            4,1,4,2,2,
            2, 1, 2, 4, 4, 3

    };

    private String[] descriptions = new String[] {
            "sem1_y_2022_1",
            "sem1_y_2022_2",
            "sem1_y_2022_3",
            "sem1_y_2022_4",
            "sem1_y_2022_5",
            "sem1_y_2022_6",
            "sem1_y_2022_7",
            "sem1_y_2022_8",
            "sem1_y_2022_9",
            "sem1_y_2022_10",
            "sem1_y_2022_11",
            "sem1_y_2022_12",
            "sem1_y_2022_13",
            "sem1_y_2022_14",

            "sem1_y_2022_16",
            "sem1_y_2022_17",
            "sem1_y_2022_18",
            "sem1_y_2022_19",
            "sem1_y_2022_20",
            "sem1_y_2022_21",
            "sem1_y_2022_22",
            "sem1_y_2022_23",
            "sem1_y_2022_24",

            "sem1_1_2022_1",
            "sem1_1_2022_2",
            "sem1_1_2022_3",
            "sem1_1_2022_4",
            "sem1_1_2022_5",
            "sem1_1_2022_6",
    };

    private int score = 0;
    private int index = 0;
    private int wrong = 0;
    private int life;

    private ArrayList<Question> questions;

    public GameManager(int life) {
        this.life = life;
        this.isLocked = false;
        questions = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Question c = new Question()
                    .setQuestion(names[i])
                    .setScore(scores[i])
                    .setImage(flags[i])
                    .setCorrect(answers[i])
                    .setAns1(ans1[i]).setAns2(ans2[i]).setAns3(ans3[i]).setAns4(ans4[i])
                    .setDescription(descriptions[i]);

            questions.add(c);
        }

    }

    public void lock(){
        this.isLocked = true;
    }
    public void unlock(){
        this.isLocked = false;
    }

    public boolean isLocked(){return this.isLocked;}

    public int getScore() {
        return score;
    }

    public int getCurrentFlag() {
        return flags[index];
    }

    public String getCurrentName() {
        return names[index];
    }

    public int getWrong() {
        return wrong;
    }

    public boolean isGameEnded(){
        return index >= flags.length;
    }

    public boolean isLose(){
        return life == wrong;
    }

    public int checkAnswer(int answer){
        int correct = answers[index];
        if (correct == answer)
            score += scores[index];
        else
            wrong++;

        index++;
        return correct;
    }

    public String getAnswer1() {
        return ans1[index];
    }


    public String getAnswer2() {
        return ans2[index];
    }

    public String getAnswer3() {
        return ans3[index];
    }

    public String getAnswer4() {
        return ans4[index];
    }
}
