package com.pranabchakma.googlebooklist;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pranab on 7/17/2018.
 */

public final class QueryUtils {
    private QueryUtils(){}
    public final static String BOOK_JSON_STRING = "{\n" +
            "   \"kind\":\"books#volumes\",\n" +
            "   \"totalItems\":435,\n" +
            "   \"items\":[\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"qKFDDAAAQBAJ\",\n" +
            "         \"etag\":\"1LREu41iw4Q\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/qKFDDAAAQBAJ\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android\",\n" +
            "            \"authors\":[\n" +
            "               \"P.K. Dixit\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Vikas Publishing House\",\n" +
            "            \"publishedDate\":\"2014\",\n" +
            "            \"description\":\"Android is a movement that has transferred data from laptop to hand-held devices like mobiles. Though there are alternate technologies that compete with Android, but it is the front runner in mobile technology by a long distance. Good knowledge in basic Java will help you to understand and develop Android technology and apps. Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts. It includes a lot of diagrams along with explanations to facilitate better understanding by students. This book aptly concludes with a project that uses Android, which will greatly benefit students in learning the practical aspects of Android. Key Features • Instructions in designing different Android user interfaces • Thorough explanations of all activities • JSON • Android-based project to aid practical understanding\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9789325977884\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"9325977885\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":false,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":372,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":false,\n" +
            "            \"contentVersion\":\"preview-1.0.0\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=qKFDDAAAQBAJ&printsec=frontcover&dq=android&hl=&cd=1&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=qKFDDAAAQBAJ&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android.html?hl=&id=qKFDDAAAQBAJ\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android-sample-pdf.acsm?id=qKFDDAAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=qKFDDAAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"PRlytmflmhoC\",\n" +
            "         \"etag\":\"6CfuKzTYSks\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/PRlytmflmhoC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Learn HTML5 and JavaScript for Android\",\n" +
            "            \"authors\":[\n" +
            "               \"Gavin Williams\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Apress\",\n" +
            "            \"publishedDate\":\"2012-09-22\",\n" +
            "            \"description\":\"Learn HTML5 and JavaScript for Android teaches the essential HTML5 and JavaScript skills you need to make great apps for the Android platform and browser. This book guides you through the creation of a mobile web app. You'll put the HTML5, CSS3 and JavaScript skills you learn into practice, giving you invaluable first-hand experience that will serve you well as you go on to develop your own web apps for Android smartphones and tablets. Throughout this book, you will learn new skills and bring these altogether to create a web app that runs on the Android platform as well as other mobile platforms.\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781430243489\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1430243481\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":386,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"2.4.3.0.preview.3\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=PRlytmflmhoC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=PRlytmflmhoC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=PRlytmflmhoC&printsec=frontcover&dq=android&hl=&cd=2&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=PRlytmflmhoC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Learn_HTML5_and_JavaScript_for_Android.html?hl=&id=PRlytmflmhoC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Learn_HTML5_and_JavaScript_for_Android-sample-epub.acsm?id=PRlytmflmhoC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Learn_HTML5_and_JavaScript_for_Android-sample-pdf.acsm?id=PRlytmflmhoC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=PRlytmflmhoC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Learn HTML5 and JavaScript for Android teaches the essential HTML5 and JavaScript skills you need to make great apps for the Android platform and browser. This book guides you through the creation of a mobile web app.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"LY1FDwAAQBAJ\",\n" +
            "         \"etag\":\"M/fFnLN15wM\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/LY1FDwAAQBAJ\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android Phones & Tablets For Dummies\",\n" +
            "            \"authors\":[\n" +
            "               \"Dan Gookin\"\n" +
            "            ],\n" +
            "            \"publisher\":\"John Wiley & Sons\",\n" +
            "            \"publishedDate\":\"2017-12-26\",\n" +
            "            \"description\":\"Outsmart your new Android Getting a smartphone or tablet can be intimidating for anyone, but this user-friendly guide is here to help you to get the most out of all your new gadget has to offer! Whether you’re upgrading from an older model or totally new to the awesome world of Androids, this book makes it easier than ever to get up and running with the latest technology. From setup and configuration to taking advantage of all those intricate bells and whistles, Android Phones & Tablets For Dummies helps you unleash everything your Android can do for you. If you’re looking to use your phone or tablet for texting, emailing, accessing the Internet, or anything in between, you’ll want to keep this go-to reference close by every step of the way. • Make sense of the phone features • Find your way around with navigation • Capture moments on the camera • Seamlessly sync with a PC or Mac Who needs a headache when dealing with a new device? This book makes it totally pain free!\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781119453857\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1119453852\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":false,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":384,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":false,\n" +
            "            \"contentVersion\":\"0.1.0.0.preview.1\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=LY1FDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=LY1FDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=LY1FDwAAQBAJ&printsec=frontcover&dq=android&hl=&cd=3&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=LY1FDwAAQBAJ&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android_Phones_Tablets_For_Dummies.html?hl=&id=LY1FDwAAQBAJ\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=LY1FDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"This book focuses on Android technology for both phones and tablets.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"1Y7jY06XNF4C\",\n" +
            "         \"etag\":\"cvhpzQ9CF3U\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/1Y7jY06XNF4C\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android\",\n" +
            "            \"authors\":[\n" +
            "               \"J. F. DiMarzio\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Tata McGraw-Hill Education\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"0071070591\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9780071070591\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":false,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":false,\n" +
            "            \"contentVersion\":\"0.0.1.0.preview.1\",\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=1Y7jY06XNF4C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=1Y7jY06XNF4C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=1Y7jY06XNF4C&printsec=frontcover&dq=android&hl=&cd=4&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=1Y7jY06XNF4C&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android.html?hl=&id=1Y7jY06XNF4C\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=1Y7jY06XNF4C&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"yV93qsHwIcsC\",\n" +
            "         \"etag\":\"ZQaslDOOy4w\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/yV93qsHwIcsC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android\",\n" +
            "            \"authors\":[\n" +
            "               \"Henry Kuttner\",\n" +
            "               \"Catherine Lucile Moore\"\n" +
            "            ],\n" +
            "            \"publisher\":\"eStar Books\",\n" +
            "            \"publishedDate\":\"2012-01-01\",\n" +
            "            \"description\":\"Androids were obviously not human... so they claimedExcerptBradley looked at the Director's head. His stomach tried' to crawl up into his throat. He felt suddenly dizzy. He knew that he was betraying himself, and that would be absolutely fatal.He reached into his pocket, pulled out a pack of cigarettes and a few coins, and let the coins drop, as though by accident, to the airfoam carpet.\\\"Oh-oh,\\\" he said, and immediately crouched down to recover the money. It's a basic principle of first aid, in cases of shock or faintness, to lower the head, and Bradley was doing just that. The giddiness began to pass as his circulation picked up. In a moment, he knew, he'd have to stand up and face the Director, and by that time he was determined to have his feelings under control. But how the devil could the Director's head be where it was-after last night?And then sanity came back. He remembered that, last night, the Director couldn't possibly have recognized him through the rubber-plastic false-face he had worn. On the other hand, after last night, the Director of New Products, Inc., should have been incapable of living or breathing, not to speak of using his memory-centers. Bradley had left the man's body in one corner of the room and his head in another.Man?With a violent effort he controlled himself. He recaptured the last coin and stood up, his face flushed. \\\"Sorry,\\\" he said. \\\"I came in to deliver that report on the induced mutation project, not to act like a horn of plenty.\\\" His fascinated stare moved down to the Director's neck and flicked away. The high collar concealed any- any mark. Any mark, such as might have been left by razor-sharp steel shearing through flesh and bone. . . . Was there a reason for the high collar? Bradley couldn't be sure. In the fall of 2060, men's fashions had changed considerably from the uncomfortable styles of a few years before, and the Director's flaring half-cape, with its gilt-braided, close-fitting collar, was far from extreme. Bradley owned one like that himself.Lord, he thought in white panic-can't the-the things even be killed?\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781612104539\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1612104533\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Fiction\"\n" +
            "            ],\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":false,\n" +
            "            \"contentVersion\":\"1.1.1.0.preview.3\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=yV93qsHwIcsC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=yV93qsHwIcsC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=yV93qsHwIcsC&printsec=frontcover&dq=android&hl=&cd=5&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=yV93qsHwIcsC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android.html?hl=&id=yV93qsHwIcsC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=yV93qsHwIcsC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Androids were obviously not human... so they claimedExcerptBradley looked at the Director&#39;s head.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"xr6-92Kt8zAC\",\n" +
            "         \"etag\":\"sUW/XJENn5g\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/xr6-92Kt8zAC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android Phones For Dummies\",\n" +
            "            \"authors\":[\n" +
            "               \"Dan Gookin\"\n" +
            "            ],\n" +
            "            \"publisher\":\"John Wiley & Sons\",\n" +
            "            \"publishedDate\":\"2012-03-09\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781118232446\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1118232445\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":352,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"averageRating\":3.5,\n" +
            "            \"ratingsCount\":4,\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"2.9.5.0.preview.3\",\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=xr6-92Kt8zAC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=xr6-92Kt8zAC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=xr6-92Kt8zAC&printsec=frontcover&dq=android&hl=&cd=6&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=xr6-92Kt8zAC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android_Phones_For_Dummies.html?hl=&id=xr6-92Kt8zAC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_Phones_For_Dummies-sample-epub.acsm?id=xr6-92Kt8zAC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_Phones_For_Dummies-sample-pdf.acsm?id=xr6-92Kt8zAC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=xr6-92Kt8zAC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Then this is the book you need! Written in the typical fun and friendly For Dummies style, this full-color guide covers the basics of all the features of Android phones without weighing you down with heavy technical terms or jargon.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"6tLAyQLSzG0C\",\n" +
            "         \"etag\":\"fZPV17sxViQ\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/6tLAyQLSzG0C\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android for Work\",\n" +
            "            \"subtitle\":\"Productivity for Professionals\",\n" +
            "            \"authors\":[\n" +
            "               \"Marziah Karch\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Apress\",\n" +
            "            \"publishedDate\":\"2010-09-01\",\n" +
            "            \"description\":\"Android is new, Android is open, and Android is fun. It’s also serious about business. Android for Work shows you how to harness the power of Android to stay productive and take your office on the road. This book also sheds light on the often daunting task of finding the right Android phone for the business user. Whether this is your first smartphone, your first Android smartphone, or your first attempt to make your phone into a productivity tool, Android for Work gets you started. You’ll learn how to manage email and tasks, but you’ll also learn how to weed through the sea of games to find specialized productivity tools for a variety of professions. For those that are more interested in an enterprise wide deployment, the book includes an appendix of information on administering Android phones, creating custom interfaces, and creating specialized apps for your enterprise. You’ll also learn more about integrating Android with other Google Apps for enterprise. What you’ll learn Select the Android phone that is right for you Integrate your work email and calendar tools Navigate business trips and meetings with ease Find specialized apps for your profession Collaborate with coworkers in large and small groups Harness the power of Android customization Who this book is for This book is for anyone who is considering an Android phone or who has recently purchased one. Whether you are a web designer, writer, medical professional, lawyer, or educator, an Android phone can help you be more productive and finally find a reason for having a phone with a data plan. Table of Contents Buying and Activating an Android Phone Using Your Phone for the First Time Going Online with Android Android Calling Managing Texting Wrangling Your E-mail The Calendar Android in a Microsoft World Photos and Video Web Browsing Social Media and Work Maps and Mobile The Remaining Android Apps The Android Market General Business Applications Specialized Apps for Professionals Advanced Customization and Troubleshooting Resources for Managing Enterprise-Wide Android Deployment Resources for Developing Android Apps\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781430230007\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1430230002\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":312,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"averageRating\":3.5,\n" +
            "            \"ratingsCount\":18,\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"0.1.2.0.preview.3\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=6tLAyQLSzG0C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=6tLAyQLSzG0C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=6tLAyQLSzG0C&printsec=frontcover&dq=android&hl=&cd=7&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=6tLAyQLSzG0C&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android_for_Work.html?hl=&id=6tLAyQLSzG0C\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_for_Work-sample-epub.acsm?id=6tLAyQLSzG0C&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_for_Work-sample-pdf.acsm?id=6tLAyQLSzG0C&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=6tLAyQLSzG0C&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Android for Work shows you how to harness the power of Android to stay productive and take your office on the road. This book also sheds light on the often daunting task of finding the right Android phone for the business user.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"TwV45aVC14IC\",\n" +
            "         \"etag\":\"/10Z3jfredc\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/TwV45aVC14IC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android Programming Unleashed\",\n" +
            "            \"authors\":[\n" +
            "               \"B.M. Harwani\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Sams Publishing\",\n" +
            "            \"publishedDate\":\"2012-12-14\",\n" +
            "            \"description\":\"Android Programming Unleashed is the most comprehensive and technically sophisticated guide to best-practice Android development with today's powerful new versions of Android: 4.1 (Jelly Bean) and 4.0.3 (Ice Cream Sandwich). Offering the exceptional breadth and depth developers have come to expect from the Unleashed series, it covers everything programmers need to know to develop robust, high-performance Android apps that deliver a superior user experience. Leading developer trainer Bintu Harwani begins with basic UI controls, then progresses to more advanced topics, finally covering how to develop feature rich Android applications that can access Internet-based services and store data. He illuminates each important SDK component through complete, self-contained code examples that show developers the most effective ways to build production-ready code. Coverage includes: understanding the modern Android platform from the developer's standpoint… using widgets, containers, resources, selection widgets, dialogs, and fragments… supporting actions and persistence… incorporating menus, ActionBars, content providers, and databases… integrating media and animations… using web, map, and other services… supporting communication via messaging, contacts, and emails… publishing Android apps, and much more.\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9780133151749\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"0133151743\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":696,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"1.5.5.0.preview.3\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=TwV45aVC14IC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=TwV45aVC14IC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=TwV45aVC14IC&printsec=frontcover&dq=android&hl=&cd=8&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=TwV45aVC14IC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android_Programming_Unleashed.html?hl=&id=TwV45aVC14IC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED_FOR_ACCESSIBILITY\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":false\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=TwV45aVC14IC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"Offering the exceptional breadth and depth developers have come to expect from the Unleashed series, it covers everything programmers need to know to develop robust, high-performance Android apps that deliver a superior user experience.\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"2XeNswkT_2YC\",\n" +
            "         \"etag\":\"wWjjpcGUNnc\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/2XeNswkT_2YC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Beginning Android 2\",\n" +
            "            \"authors\":[\n" +
            "               \"Mark Murphy\"\n" +
            "            ],\n" +
            "            \"publisher\":\"Apress\",\n" +
            "            \"publishedDate\":\"2010-03-19\",\n" +
            "            \"description\":\"The Android development platform, created by Google and the Open Handset Alliance, is a platform in its truest sense, encompassing hundreds of classes beyond the traditional Java classes and open source components that ship with the SDK. With Beginning Android 2, you’ll learn how to develop applications for Android 2.x mobile devices, using simple examples that are ready to run with your copy of the software development kit. Author, Android columnist, writer, developer, and community advocate Mark L. Murphy will show you what you need to know to get started programming Android applications, including how to craft graphical user interfaces, use GPS, and access web services. What you’ll learn Discover Android and how to use it to build Java-based mobile applications for a wide range of phones and other devices. Create user interfaces using both the Android widget framework and the built-in WebKit-powered Web browser components. Utilize the distinctive capabilities of the Android engine, including location tracking, maps, and Internet access. Use and create Android applications incorporating activities, services, content providers, and broadcast receivers. Support Android 1.5, 1.6, and 2.0 devices, including dealing with multiple Android OS versions, multiple screen sizes, and other device-specific characteristics. Who this book is for This book is aimed at people new to mobile development, but with some knowledge of Java. Table of Contents The Big Picture Projects & Targets Creating a Skeleton Application Using XML-Based Layouts Employing Basic Widgets Working with Containers Using Selection Widgets Getting Fancy With Lists Employing Fancy Widgets and Containers The Input Method Framework Applying Menus Fonts Embedding the WebKit Browser Showing Pop-Up Messages Dealing with Threads Handling Activity Lifecycle Events Creating Intent Filters Launching Activities and Sub-Activities Handling Rotation Working with Resources Using Preferences Managing and Accessing Local Databases Accessing Files Leveraging Java Libraries Communicating via the Internet Using a Content Provider Building a Content Provider Requesting and Requiring Permissions Creating a Service Invoking a Service Alerting Users Via Notifications Accessing Location-Based Services Mapping with MapView and MapActivity Handling Telephone Calls Development Tools Handling Multiple Screen Sizes Dealing with Devices Handling Platform Changes Where Do We Go From Here?\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781430226291\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1430226293\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":416,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"averageRating\":2.0,\n" +
            "            \"ratingsCount\":2,\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"1.3.3.0.preview.3\",\n" +
            "            \"panelizationSummary\":{\n" +
            "               \"containsEpubBubbles\":false,\n" +
            "               \"containsImageBubbles\":false\n" +
            "            },\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=2XeNswkT_2YC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=2XeNswkT_2YC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=2XeNswkT_2YC&pg=PA180&dq=android&hl=&cd=9&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=2XeNswkT_2YC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Beginning_Android_2.html?hl=&id=2XeNswkT_2YC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Beginning_Android_2-sample-epub.acsm?id=2XeNswkT_2YC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Beginning_Android_2-sample-pdf.acsm?id=2XeNswkT_2YC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=2XeNswkT_2YC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"\\u003cb\\u003eandroid\\u003c/b\\u003e :layout_weight=&quot;l&quot; /&gt; &lt;EditText \\u003cb\\u003eandroid\\u003c/b\\u003e :id=&quot;@+id/lon&quot; \\u003cb\\u003eandroid\\u003c/b\\u003e : \\u003cbr\\u003e\\nlayout_width=&quot;f ill_parent &quot; \\u003cb\\u003eandroid\\u003c/b\\u003e : layout_height=&quot;wrap_content&quot; \\u003cb\\u003eandroid\\u003c/b\\u003e :\\u003cbr\\u003e\\ncursorVisible= &quot;true&quot; \\u003cb\\u003eandroid\\u003c/b\\u003e :editable=&quot;true&quot; \\u003cb\\u003eandroid\\u003c/b\\u003e : singlel_ine=&quot;true&quot; \\u003cb\\u003eandroid\\u003c/b\\u003e\\u003cbr\\u003e\\n&nbsp;...\"\n" +
            "         }\n" +
            "      },\n" +
            "      {\n" +
            "         \"kind\":\"books#volume\",\n" +
            "         \"id\":\"1C3yNgqZnUkC\",\n" +
            "         \"etag\":\"auk/k8uWfzY\",\n" +
            "         \"selfLink\":\"https://www.googleapis.com/books/v1/volumes/1C3yNgqZnUkC\",\n" +
            "         \"volumeInfo\":{\n" +
            "            \"title\":\"Android Application Development For Dummies\",\n" +
            "            \"authors\":[\n" +
            "               \"Donn Felker\"\n" +
            "            ],\n" +
            "            \"publisher\":\"John Wiley & Sons\",\n" +
            "            \"publishedDate\":\"2010-11-17\",\n" +
            "            \"industryIdentifiers\":[\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_10\",\n" +
            "                  \"identifier\":\"1118005155\"\n" +
            "               },\n" +
            "               {\n" +
            "                  \"type\":\"ISBN_13\",\n" +
            "                  \"identifier\":\"9781118005156\"\n" +
            "               }\n" +
            "            ],\n" +
            "            \"readingModes\":{\n" +
            "               \"text\":true,\n" +
            "               \"image\":true\n" +
            "            },\n" +
            "            \"pageCount\":360,\n" +
            "            \"printType\":\"BOOK\",\n" +
            "            \"categories\":[\n" +
            "               \"Computers\"\n" +
            "            ],\n" +
            "            \"averageRating\":3.0,\n" +
            "            \"ratingsCount\":39,\n" +
            "            \"maturityRating\":\"NOT_MATURE\",\n" +
            "            \"allowAnonLogging\":true,\n" +
            "            \"contentVersion\":\"0.1.3.0.preview.3\",\n" +
            "            \"imageLinks\":{\n" +
            "               \"smallThumbnail\":\"http://books.google.com/books/content?id=1C3yNgqZnUkC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "               \"thumbnail\":\"http://books.google.com/books/content?id=1C3yNgqZnUkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "            },\n" +
            "            \"language\":\"en\",\n" +
            "            \"previewLink\":\"http://books.google.com/books?id=1C3yNgqZnUkC&printsec=frontcover&dq=android&hl=&cd=10&source=gbs_api\",\n" +
            "            \"infoLink\":\"http://books.google.com/books?id=1C3yNgqZnUkC&dq=android&hl=&source=gbs_api\",\n" +
            "            \"canonicalVolumeLink\":\"https://books.google.com/books/about/Android_Application_Development_For_Dumm.html?hl=&id=1C3yNgqZnUkC\"\n" +
            "         },\n" +
            "         \"saleInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"saleability\":\"NOT_FOR_SALE\",\n" +
            "            \"isEbook\":false\n" +
            "         },\n" +
            "         \"accessInfo\":{\n" +
            "            \"country\":\"BD\",\n" +
            "            \"viewability\":\"PARTIAL\",\n" +
            "            \"embeddable\":true,\n" +
            "            \"publicDomain\":false,\n" +
            "            \"textToSpeechPermission\":\"ALLOWED\",\n" +
            "            \"epub\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_Application_Development_For_Dumm-sample-epub.acsm?id=1C3yNgqZnUkC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"pdf\":{\n" +
            "               \"isAvailable\":true,\n" +
            "               \"acsTokenLink\":\"http://books.google.com/books/download/Android_Application_Development_For_Dumm-sample-pdf.acsm?id=1C3yNgqZnUkC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
            "            },\n" +
            "            \"webReaderLink\":\"http://play.google.com/books/reader?id=1C3yNgqZnUkC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "            \"accessViewStatus\":\"SAMPLE\",\n" +
            "            \"quoteSharingAllowed\":false\n" +
            "         },\n" +
            "         \"searchInfo\":{\n" +
            "            \"textSnippet\":\"With millions of smartphone users and a cornucopia of carriers, Android is a great place to ply the app development trade. This book shows you from the ground up how to set up your environment and create an app.\"\n" +
            "         }\n" +
            "      }\n" +
            "   ]\n" +
            "}";
    public static List<Book> getBooksList(){
        List<Book> books = new ArrayList<Book>();
        try {
            JSONObject root = new JSONObject(BOOK_JSON_STRING);
            JSONArray booksArray = root.getJSONArray("items");
            for (int i=0;i<booksArray.length();i++){
                JSONObject currentBook = booksArray.getJSONObject(i);
                JSONObject volumeInfo = currentBook.getJSONObject("volumeInfo");
                String title = volumeInfo.getString("title");
                String publisher = volumeInfo.has("publisher")?volumeInfo.getString("publisher"):"No publisher";
                String publishDate = volumeInfo.has("publishedDate")?volumeInfo.getString("publishedDate"):"No published Date";
                String description= volumeInfo.has("description")? volumeInfo.getString("description"):"No description";
                String pagecount = volumeInfo.has("pageCount")?volumeInfo.getString("pageCount"):" information not avilable";
                String categories = volumeInfo.getJSONArray("categories").get(0).toString();
                JSONArray authors = volumeInfo.getJSONArray("authors");
                String authorList = authors.getString(0).toString();
                Book book = new Book(title,authorList,publisher,publishDate,description,pagecount,categories);
                books.add(book);
            }
        } catch (JSONException e) {
            Log.d("?","error");
        }
        return books;
    }
}
