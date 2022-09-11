<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#introduction">Introduction</a>
      <ol>
        <li><a href="#setup">Setup</a></li>
        <li><a href="#01-car-assembly-line">01-car-assembly-line</a></li>
      </ol>
    </li>
    <li><a href="#basic-cicd-workflow">Basic CI/CD workflow</a>
      <ol>
        <li><a href="#02-static-gatsby-website">02-static-gatsby-website</a></li>
      </ol>
    </li>
  </ol>
</details>

&nbsp;

## About The Project

- GitLab CI: Pipelines, CI/CD and DevOps for Beginners
- Learn GitLab CI / CD with Docker & DevOps: obtain valuable DevOps skills. Build pipelines.
- Introduction -> Basic CI/CD Workflow -> GitLab CI Fundamentals -> Advanced CI/CD workflows -> Advanced usage & specific topics
- Valentin Despa

&nbsp;

---

&nbsp;

## Introduction

- GitHub has a similar concept called **GitHub Actions**. You can create pipelines in any CI/CD systems.
- **Why GitLab CI?**
  - Scalable architecture
  - Docker first approach
  - Pipeline as a code
  - Merge requests with CI support
  - Partially open source

### Setup

- GitLab Project -> Settings -> CI/CD -> Runners
  - [Specific runners](https://docs.gitlab.com/runner/install/)
  - Shared runners (May require credit card)
- SSH Setup
- Docker Setup (Ruby Image)

### 01-car-assembly-line

- **stages**
- Job1 (Upload) & Job2 (Download) via **artifact repository**
- **GitLab Architecture**
  - Server -> Runner(s) -> Artifacts

&nbsp;

---

&nbsp;

> **Quan:** Pipelines in real projects

> **Valentin:** One pipeline per project (real project, not Gitlab project) or multiple pipeline per project?
>
> Many of the software build today is a small component (sometimes also called microservice). For such small projects, typically there is one Gitlab project and one pipeline.
>
> Gitlab can anyway only have one pipeline per Gitlab project. Larger projects may need a pipeline to span multiple projects. There is no hard rule, it depends from case to case.
>
> **One developer has his own pipeline or share a pipeline with other developers?**
>
> Typically the master pipeline is shared by everybody. If a merge request Git workflow is used, each developer will create a new branch and have his/her own pipeline. So one pipeline per branch.
>
> **When you debug by run/fail a lot of time, does this affect other developers?**
>
> If you use branches, this will not affect others. If the pipeline for the master branch fails, this will affect everyone. I hope this clarifies a few things.

&nbsp;

---

&nbsp;

### Basic CI/CD workflow

- **Continuous Integration (CI)**
  - Practice of continuously integrating code changes
  - Ensures that the project **can still be built/ compiled**
  - Ensures that any changes **pass all tests**, guidelines, and code compliance standards
  - **CI Server:** Jenkins, GitLab CI, Circle CI TeamCity, Travis, etc.
  - **Advantages:**
    - Errors are detected early in the development process
    - Reduces integration problems
    - Allows developers to work faster
- **Continuous Delivery (CD)**
  - Ensures that the software can be **deployed anytime** to production
  - Commonly, the latest version is **deployed to a testing or staging system**
- **Advantages of CI & CD**
  - **Ensures that every change is releasable** by testing that it can be deployed
  - **Reduced risk** of a new deployment
  - **Delivers value** much faster

![ci-cd-pipeline](00-diagrams/ci-cd-pipeline.png)

### 02-static-gatsby-website

```sh
cd 02-static-gatsby-website && npm run develop

# Build the project locally
# requires gatsby-cli
gatsby build
```

- Build Step
- Exit status
  - **0:** Job succeeded
  - **1 - 255:** ERROR: Job failed: exit code 1
- Running jobs in parallel
  - Assigning two jobs to the same stage makes them run in parallel
  - Make sure there are no dependencies between them
- Running jobs in the background
  - Server takes a few seconds to start
  - [Failed writing body](https://stackoverflow.com/questions/16703647/why-does-curl-return-error-23-failed-writing-body)
- surge.sh for Frontend
- Environment variables

&nbsp;

---

&nbsp;
