# :lion: Compose ChatGPT Kotlin - Android Chatbot (In Progress) 
> _This README is written by ChatGPT_

<p align="justify">
<img src="https://res.cloudinary.com/apideck/image/upload/v1672442492/marketplaces/ckhg56iu1mkpc0b66vj7fsj3o/listings/-4-ans_frontend_assets.images.poe.app_icon.png-26-8aa0a2e5f237894d_tbragv.png?raw=true" width="190px" height=auto align="right" alt="Computador"/>
Compose ChatGPT Kotlin is an open-source Android chatbot application built using Jetpack Compose and Kotlin programming language. It integrates with OpenAI's GPT-3, GPT-4 API to generate human-like responses to user messages. The app is designed to be easy to use and highly customizable, allowing users to easily integrate the chatbot functionality into their existing projects.

This project showcases the use of modern Android development tools and techniques, including Jetpack Compose for building responsive UIs, Kotlin Coroutines for asynchronous programming, and Dagger Hilt for dependency injection. It also demonstrates how to use the OpenAI GPT-3, GPT-4 API to create a powerful and intelligent chatbot.<br/>

The project has a well-organized folder structure that makes it easy to navigate and understand the codebase. The code is well-documented and follows best practices for clean and maintainable code.<br/>

Overall, Compose ChatGPT Kotlin is a powerful and flexible chatbot solution that can be easily integrated into any Android project. With its modern architecture and powerful features, it is an excellent example of how to build high-quality Android applications using the latest tools and techniques.
</p>

## Screenshots

<p>
<img src="./screenshots/demo_chatgpt_lite.gif" width="200px"/>
<img src="./screenshots/demo_1.jpeg" width="200px"/>
<img src="./screenshots/demo_2.jpeg" width="200px"/>
<img src="./screenshots/demo_3.jpg" width="200px"/>
</p>


## Requirements
- Android Studio Ladybug or later
- OpenAI API Key
- Firebase


## Getting Started

1. Clone the repository.
2. Setup your Firebase and put file ***google-services.json*** into ***app/***
3. Obtain an OpenAI API Key from the OpenAI website.
4. In the ***app/src/main/java/com/chatgptlite/wanted/constants/Constants.kt*** file, add the following line and replace <your-api-key> with your actual API key:
openAIApiKey=<your-api-key>
5. Build and run the app on an emulator or physical device.

## Directory Structure

```terminal
.
├── app
│   ├── build.gradle
│   ├── proguard-rules.pro
│   ├── src
│   │   ├── androidTest
│   │   ├── main
│   │   │   ├── java/com/chatgptlite/wanted
│   │   │   │   ├── constants
│   │   │   │   ├── data
│   │   │   │   ├── di
│   │   │   │   ├── helpers
│   │   │   │   ├── models
│   │   │   │   ├── ui
│   │   │   │   └── MainActivity.kt
│   │   │   │   └── MainViewModel.kt
│   │   │   ├── res
│   │   │   └── AndroidManifest.xml
│   │   ├── test
│   │   └── ...
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

The ***app*** directory contains all the source code and resources of the application. It contains a build.gradle file, which is used to configure the build process for the application, and a proguard-rules.pro file, which contains rules for ProGuard, a tool used to shrink and obfuscate code.

Within the ***src*** directory, there are two subdirectories: androidTest and main. The androidTest directory contains integration tests for the application on Android. The main directory contains the majority of the source code and resources for the application, and is further broken down into subdirectories:

- `constants`: This directory contains constant values used throughout the application.
- `data`: This directory contains the data layer of the application, including repositories and data sources.
- `di`: This directory contains the Dependency Injection setup for the application.
- `helpers`: This directory contains utility classes used throughout the application.
- `models`: This directory contains the data models used throughout the application.
- `ui`: This directory contains the user interface components of the application, including Activities, Fragments, and Composables.
- `MainActivity.kt`: This file contains the implementation of the main activity for the application.
- `MainViewModel.kt`: This file contains the implementation of the main view model for the application.

The project also contains other files and directories at the root level, including the build.gradle file, which is used to configure the build process for the entire project, the gradle directory, which contains files related to the Gradle build system, and the gradlew and gradlew.bat scripts, which are used to run Gradle commands. The gradle.properties file contains properties used by the Gradle build system, and the settings.gradle file is used to configure the Gradle settings for the project.

## Features

- [x] New Chat
- [x] Chat History
- [x] ChatBot with ChatGPT
  - [x] stream: true
    - [x] gpt-3.5-turbo
    - [x] gpt-4 
    - [x] text-davinci-003, text-curie-001, text-babbage-001, text-ada-001
  - [ ] stream: false
    - [ ] gpt-3.5-turbo
    - [ ] text-davinci-003, text-curie-001, text-babbage-001, text-ada-001
- [x] Stop generating
- [x] Delete conversation
- [ ] Settings for ChatGPT
- [ ] Light/Dart Themes

## Acknowledgments
- Jetpack Compose
- Retrofit
- [OpenAI GPT-3 API](https://beta.openai.com/docs/api-reference/introduction)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=lambiengcode/compose-chatgpt-kotlin-android-chatbot&type=Date)](https://star-history.com/#lambiengcode/compose-chatgpt-kotlin-android-chatbot&Date)

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue if you encounter any problems or have suggestions for improvements.

## Contact Information

If you have any questions or suggestions related to this application, please contact me via email: lambiengcode@gmail.com.

## License

```terminal
MIT License

Copyright (c) 2022 lambiengcode

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
